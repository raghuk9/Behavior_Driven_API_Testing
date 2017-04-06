package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

public class JMeterBase {

	protected static final String SPACE_STRING = " ";
	protected static final String NEW_LINE = "\n";
	protected static final String JMETER_HOME = "JMETER_HOME";
	protected static final String SLASH = "/";
	protected static final String TRUE_VALUE = "true";
	protected static final String FALSE_VALUE = "false";
	protected static final String FILE_EXTENSION = ".csv";
	protected static Properties properties = new Properties();
	protected Map<String, String> errorMap = new HashMap<>();

	public JMeterBase() {
		super();
	}

	static {
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			properties.load(input);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					System.out.println(e);
				}
			}
		}
	}

	protected String getProperty(String propertyName) {
		return properties.getProperty(propertyName);
	}

	protected StandardJMeterEngine setupJMeter() {
		StandardJMeterEngine jmeter = new StandardJMeterEngine();
		JMeterUtils.setJMeterHome(getProperty(JMETER_HOME));
		JMeterUtils.loadJMeterProperties(getProperty(JMETER_HOME) + SLASH + "bin/jmeter.properties");
		JMeterUtils.initLocale();
		return jmeter;
	}

	protected void saveTestResultsInCSVFile(HashTree testTree, String logFileName) {
		String logFileFullName = getLogFileFullName(logFileName);
		File logFile = new File(logFileFullName);
		if (logFile.exists()) {
			logFile.delete();
		}
		ResultCollector logger = new ResultCollector(new Summariser());
		logger.setFilename(logFileFullName);
		testTree.add(testTree.getArray()[0], logger);
	}

	protected final String getLogFileFullName(String logFileName) {
		return new StringBuilder(getProperty(JMETER_HOME) + SLASH + logFileName).toString();
	}

	protected void setUpAndLogErrorsIfAnyInJMeter(final String jmxFileLocation, final String logFileName)
			throws IOException, FileNotFoundException {
		StandardJMeterEngine jmeter = setupJMeter();
		HashTree testTree = SaveService.loadTree(new File(jmxFileLocation));
		jmeter.configure(testTree);
		saveTestResultsInCSVFile(testTree, getLogFileName(logFileName));
		jmeter.run();

		// Parse error results if any
		Reader logFileReader = new FileReader(getLogFileFullName(getLogFileName(logFileName)));
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(logFileReader);
		StringBuilder errorBuilder = new StringBuilder();
		for (CSVRecord csvRecord : records) {
			if (!(FALSE_VALUE.equalsIgnoreCase(csvRecord.get(7)) || TRUE_VALUE.equalsIgnoreCase(csvRecord.get(7)))) {
				continue;
			}
			if (csvRecord.get(7).contains(FALSE_VALUE)) {
				errorBuilder = new StringBuilder();
				errorBuilder.append(
						"Error occured at " + csvRecord.get(2) + SPACE_STRING + NEW_LINE + csvRecord.get(8) + NEW_LINE);
				errorMap.put(csvRecord.get(2), errorBuilder.toString());

			}
		}
	}

	private String getLogFileName(String logFileName) {
		System.out.println(logFileName);
		return logFileName + FILE_EXTENSION;
	}

}
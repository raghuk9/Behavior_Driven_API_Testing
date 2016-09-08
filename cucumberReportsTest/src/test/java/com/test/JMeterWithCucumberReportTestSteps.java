package com.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jorphan.collections.HashTree;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JMeterWithCucumberReportTestSteps extends JMeterBase {
	private static final String LOGFILE_NAME = JMeterWithCucumberReportTestSteps.class.getSimpleName();
	private static final String TRUE_VALUE = "true";
	private static final String FALSE_VALUE = "false";
	private static final String FILE_EXTENSION = ".csv";
	private static final String JMX_FILE_LOCATION = "myplan/ResourceTest.jmx";
	private static final String BACK_SLASH = "/";

	@Given("^I want to execute Sample_RESTAPI.jmx$")
	public void loadSampleRestAPIJmx() throws IOException {
		StandardJMeterEngine jmeter = setupJMeter();
		HashTree testTree = SaveService.loadTree(new File(getProperty(JMETER_HOME) + BACK_SLASH + JMX_FILE_LOCATION));
		jmeter.configure(testTree);
		saveTestResultsInCSVFile(testTree, getLogFileName());
		jmeter.run();
	}

	private String getLogFileName() {
		return LOGFILE_NAME + FILE_EXTENSION;
	}

	@When("^I POST Create post resource$")
	public void i_post_Create_post_resource() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^I GET all post resources to extract id$")
	public void i_get_all_post_resources_to_extract_id() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^I get one post resource$")
	public void i_get_one_post_resource() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("^I get resource comments$")
	public void i_get_resource_comments() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("^test should be successful$")
	public void testShouldBeSuccessful() throws IOException {
		Reader logFileReader = new FileReader(getLogFileFullName(getLogFileName()));
		Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(logFileReader);
		StringBuilder errorBuilder = new StringBuilder();
		boolean isTestFailed = false;
		for (CSVRecord csvRecord : records) {
			if (!(FALSE_VALUE.equalsIgnoreCase(csvRecord.get(7)) || TRUE_VALUE.equalsIgnoreCase(csvRecord.get(7)))) {
				continue;
			}
			if (csvRecord.get(7).contains(FALSE_VALUE)) {
				isTestFailed = true;
				errorBuilder.append(
						"Error occured at " + csvRecord.get(2) + SPACE_STRING + NEW_LINE + csvRecord.get(8) + NEW_LINE);
			}
		}
		if (isTestFailed) {
			Assert.fail(errorBuilder.toString());
		}
	}
}

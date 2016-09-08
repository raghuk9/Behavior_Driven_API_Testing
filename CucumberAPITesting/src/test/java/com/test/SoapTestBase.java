package com.test;

import java.util.List;

import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestStep;
import com.smartbear.ready.cmd.runner.SoapUITestCaseRunner;
import com.smartbear.ready.cmd.runner.pro.SoapUIProTestCaseRunner;

public class SoapTestBase {

	public SoapTestBase() {
		super();
	}

	protected void setUp(String fileLocation) throws Exception {
//		SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
//		runner.setProjectFile(fileLocation);
//		runner.setOutputFolder("error");
//		runner.run();

		SoapUIProTestCaseRunner soapUIProTestCaseRunner = new SoapUIProTestCaseRunner();
		soapUIProTestCaseRunner.setProjectFile(fileLocation);
		soapUIProTestCaseRunner.setReportFormats(new String[]{"CSV"});
		soapUIProTestCaseRunner.setReportName("readyAPIReport");
		soapUIProTestCaseRunner.setPrintReport(true); 
		soapUIProTestCaseRunner.setOutputFolder("target/readyAPI-reports"); 
		soapUIProTestCaseRunner.setMaxErrors(10000);
		soapUIProTestCaseRunner.setPrintAlertSiteReport(true);
		soapUIProTestCaseRunner.run();
	}

} 
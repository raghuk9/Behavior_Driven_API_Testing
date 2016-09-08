package com.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelloSteps extends SoapTestBase {

	private static final String SOAP_FILE_LOCATION = "C:/eclipse-workspace/cucumberReportsTest/SoapTest.xml";

	@Given("^person with name$")
	public void personWithName() throws Exception {
		setUp(SOAP_FILE_LOCATION);
	}

	@When("^i pass name$")
	public void whenIPassName() {

	}

	@Then("^name should be displayed$")
	public void nameShouldBeDisplayed() throws Exception {
		
	}
}

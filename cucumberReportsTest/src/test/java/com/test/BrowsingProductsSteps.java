package com.test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BrowsingProductsSteps extends JMeterBase {

	private static final String LOGFILE_NAME = BrowsingProductsSteps.class.getSimpleName();

	protected static final String JMX_FILE_LOCATION = "myplan/NikeVirtualServicesDemo.jmx";

	@Given("^I want to execute NikeVirtualServicesDemo.jmx$")
	public void loadSampleRestAPIJmx() throws IOException, NoSuchMethodException, SecurityException {
		setUpAndLogErrorsIfAnyInJMeter(JMX_FILE_LOCATION, LOGFILE_NAME);
	}

	@When("^I GET List of Top Menus$")
	public void i_get_list_of_top_menus() throws Throwable {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("i_get_list_of_top_menus", new Class[] {}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^I GET List of Fishing Categories$")
	public void i_get_list_of_fishing_categories() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		if (errorMap.size() > 0 && errorMap.containsKey("Fishing Categories")) {
			Assert.fail(errorMap.get("Fishing Categories"));
		}
	}

	@When("^I GET List of Boating Categories$")
	public void i_get_list_of_boating_categories() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		if (errorMap.size() > 0 && errorMap.containsKey("Boating Categories")) {
			Assert.fail(errorMap.get("Boating Categories"));
		}
	}

	@When("^I GET List of Hunting Categories$")
	public void i_get_list_of_hunting_categories() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		if (errorMap.size() > 0 && errorMap.containsKey("Hunting Categories")) {
			Assert.fail(errorMap.get("Hunting Categories"));
		}
	}

	@When("^I GET List of Fishing SubCategories$")
	public void i_get_list_of_fishing_subcategories() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		if (errorMap.size() > 0 && errorMap.containsKey("Fishing SubCategories")) {
			Assert.fail(errorMap.get("Fishing SubCategories"));
		}
	}

	@When("^I GET List of Hunting SubCategories$")
	public void i_get_list_of_hunting_subcategories() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		if (errorMap.size() > 0 && errorMap.containsKey("Hunting SubCategories")) {
			Assert.fail(errorMap.get("Fishing Categories"));
		}
	}

	@When("^I GET List of Boating SubCategories$")
	public void i_get_list_of_boating_subcategories() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		if (errorMap.size() > 0 && errorMap.containsKey("Fishing Categories")) {
			Assert.fail(errorMap.get("Boating SubCategories"));
		}
	}

	@Then("^displays products$")
	public void testShouldBeSuccessful() throws IOException {
		// Reader logFileReader = new
		// FileReader(getLogFileFullName(getLogFileName()));
		// Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(logFileReader);
		// StringBuilder errorBuilder = new StringBuilder();
		// boolean isTestFailed = false;
		// for (CSVRecord csvRecord : records) {
		// if (!(FALSE_VALUE.equalsIgnoreCase(csvRecord.get(7)) ||
		// TRUE_VALUE.equalsIgnoreCase(csvRecord.get(7)))) {
		// continue;
		// }
		// if (csvRecord.get(7).contains(FALSE_VALUE)) {
		// isTestFailed = true;
		// errorBuilder.append(
		// "Error occured at " + csvRecord.get(2) + SPACE_STRING + NEW_LINE +
		// csvRecord.get(8) + NEW_LINE);
		// }
		// }
		// if (isTestFailed) {
		// Assert.fail(errorBuilder.toString());
		// }
	}

	private String getKeyFromMethodAnnotationValue(Method method) throws NoSuchMethodException {
		Annotation[] annotations = method.getAnnotations();
		String key = null;
		for (Annotation annotation : annotations) {
			String annotationAsString = annotation.toString();
			key = annotationAsString.substring(annotationAsString.indexOf('^') + 1, annotationAsString.indexOf('$'));
			System.out.println("Annotation strig value = " + annotation.toString() + "key = " + key);
		}
		return key;
	}
}

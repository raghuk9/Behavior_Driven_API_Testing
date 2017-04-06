package com.test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Assert;



import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddingToGuestCart extends JMeterBase {
	
	/*ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:/ppt/extent.html");*/
	
	

	private static final String LOGFILE_NAME = AddingToGuestCart.class.getSimpleName();
	protected static final String JMX_FILE_LOCATION = "C:/Backup/workspace/ss/cucumberReportsTest/jmx/AddingToGuestCartScenario.jmx";
	private static final String REGULAR_EXPRESSION_NUMBER = "(\\d+)";

	@Given("^I want to execute BrowsingProducts.jmx$")
	public void iWantToExecuteBrowsingProducts() throws IOException, InterruptedException {
		setUpAndLogErrorsIfAnyInJMeter(JMX_FILE_LOCATION, LOGFILE_NAME);
		/*extent.attachReporter(htmlReporter);
		ExtentTest feature = extent.createTest("Shopping Cart");
		ExtentTest scenario = feature.createNode(Scenario.class.getName());
		scenario.createNode(And.class.getName());
		System.out.println(Scenario.class.getName());
		System.out.println(feature.getStatus().toString());
		Thread.sleep(5000);
		htmlReporter.flush();
		extent.flush();	*/	
	}

	@When("^Itid(\\d+) I GET List of Browsing Top Menus$")
	public void I_GET_List_of_Browsing_Top_Menus(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Browsing_Top_Menus", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
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

	@When("^Itid(\\d+) I GET List of Browsing Fishing Categories$")
	public void I_GET_List_of_Browsing_fishing_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Browsing_fishing_categories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Browsing Boating Categories$")
	public void I_GET_List_of_Browsing_boating_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Browsing_boating_categories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Browsing Hunting Categories$")
	public void I_GET_List_of_Browsing_hunting_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Browsing_hunting_categories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Browsing Fishing SubCategories$")
	public void I_GET_List_of_Browsing_fishing_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Browsing_fishing_subcategories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Browsing Boating SubCategories$")
	public void I_GET_List_of_Browsing_boating_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Browsing_boating_subcategories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Browsing Hunting SubCategories$")
	public void I_GET_List_of_Browsing_hunting_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Browsing_hunting_subcategories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@Then("^display browsing products$")
	public void thenShouldDisplayBrowsingProducts() throws IOException {
	}

	@Given("^I want to execute AddingToGuestCartScenario.jmx$")
	public void addingToGuestCartScenario() throws IOException {
		setUpAndLogErrorsIfAnyInJMeter(JMX_FILE_LOCATION, LOGFILE_NAME);
	}

	@When("^Itid(\\d+) I GET List of Guest Top Menus$")
	public void I_GET_List_of_Guest_Top_Menus(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_Top_Menus", new Class[] { int.class }));
		keyFromMethodAnnotationValue = keyFromMethodAnnotationValue.replace(REGULAR_EXPRESSION_NUMBER, String.valueOf(Itid));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Fishing Categories$")
	public void I_GET_List_of_Guest_fishing_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_fishing_categories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Boating Categories$")
	public void I_GET_List_of_Guest_boating_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_boating_categories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Hunting Categories$")
	public void I_GET_List_of_Guest_hunting_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_hunting_categories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Fishing SubCategories$")
	public void I_GET_List_of_Guest_fishing_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_fishing_subcategories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Boating SubCategories$")
	public void I_GET_List_of_Guest_boating_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_boating_subcategories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Hunting SubCategories$")
	public void I_GET_List_of_Guest_hunting_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_hunting_subcategories", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Product Details$")
	public void I_GET_List_of_Guest_product_details(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Guest_product_details", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I POST Items in Guest Cart$")
	public void I_POST_items_in_Guest_cart(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_POST_items_in_Guest_cart", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Guest Cart Items$")
	public void I_GET_list_of_Guest_cart_items(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_list_of_Guest_cart_items", new Class[] { int.class }));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@Then("^display Guest Cart items$")
	public void thenShouldDisplayGuestCartItems() throws IOException {
	}

}

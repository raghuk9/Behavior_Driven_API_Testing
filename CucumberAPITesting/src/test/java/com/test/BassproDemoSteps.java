package com.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BassproDemoSteps extends SoapTestBase {

	private static final String SOAP_FILE_LOCATION = "C:/eclipse-workspace/cucumberReportsTest/Basspro-Virtual-Service-Demo-soapui-project.xml";

	private static final String REGULAR_EXPRESSION_NUMBER = "(\\d+)";
	private static final String LOGFILE_NAME = BassproDemoSteps.class.getSimpleName();

	@Given("^I want to execute guest add to cart sceanario$")
	public void loadSampleReadyAPI() throws Exception {
		setUp(SOAP_FILE_LOCATION);
	}

	@When("^Itid(\\d+) I GET List of Guest Top Menus$")
	public void I_GET_List_of_Top_Menus(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Top_Menus", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I GET List of Guest Fishing Categories$")
	public void I_GET_List_of_fishing_categories(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_fishing_categories", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I GET List of Guest Boating Categories$")
	public void I_GET_List_of_boating_categories(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_boating_categories", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I GET List of Guest Hunting Categories$")
	public void I_GET_List_of_hunting_categories(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_hunting_categories", new Class[] { int.class }));
		keyFromMethodAnnotationValue = keyFromMethodAnnotationValue.replace(REGULAR_EXPRESSION_NUMBER,
				String.valueOf(Itid));
	}

	@When("^Itid(\\d+) I GET List of Guest Fishing SubCategories$")
	public void I_GET_List_of_fishing_subcategories(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_fishing_subcategories", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I GET List of Guest Boating SubCategories$")
	public void I_GET_List_of_boating_subcategories(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_boating_subcategories", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I GET List of Guest Hunting SubCategories$")
	public void I_GET_List_of_hunting_subcategories(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_hunting_subcategories", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I GET List of Guest Product Details$")
	public void I_GET_List_of_product_details(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_product_details", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I POST Items in Guest Cart$")
	public void I_POST_items_in_cart(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_POST_items_in_cart", new Class[] { int.class }));
	}

	@When("^Itid(\\d+) I GET List of Guest Cart Items$")
	public void I_GET_list_of_cart_items(int Itid) throws Exception {
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_list_of_cart_items", new Class[] { int.class }));
	}

	@Then("^display guest add results$")
	public void display_guest_add_results() throws Exception {
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

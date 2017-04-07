package com.test;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishlistScenario  extends JMeterBase {

	private static final String LOGFILE_NAME = WishlistScenario .class.getSimpleName();
	protected static final String JMX_FILE_LOCATION = "C:/git_projects/raghuk9bdd/Behavior_Driven_API_Testing/CucumberAPITesting/jmx/WishlistScenario.jmx";
	private static final String REGULAR_EXPRESSION_NUMBER = "(\\d+)";

	@Given("^I want to execute WishlistScenario.jmx$")
	public void loadSampleRestAPIJmx() throws IOException {
		setUpAndLogErrorsIfAnyInJMeter(JMX_FILE_LOCATION, LOGFILE_NAME);
	}

	@When("^Itid(\\d+) I GET List of Top Menus$")
	public void I_GET_List_of_Top_Menus(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_Top_Menus", new Class[] { int.class }));
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

	@When("^Itid(\\d+) I GET List of Fishing Categories$")
	public void I_GET_List_of_fishing_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_fishing_categories", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Boating Categories$")
	public void I_GET_List_of_boating_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_boating_categories", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Hunting Categories$")
	public void I_GET_List_of_hunting_categories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_hunting_categories", new Class[] {int.class}));
		keyFromMethodAnnotationValue = keyFromMethodAnnotationValue.replace(REGULAR_EXPRESSION_NUMBER, String.valueOf(Itid));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Fishing SubCategories$")
	public void I_GET_List_of_fishing_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_fishing_subcategories", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Boating SubCategories$")
	public void I_GET_List_of_boating_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_boating_subcategories", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Hunting SubCategories$")
	public void I_GET_List_of_hunting_subcategories(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_hunting_subcategories", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Product Details$")
	public void I_GET_List_of_product_details(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_List_of_product_details", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I POST Items in Cart$")
	public void I_POST_items_in_cart(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_POST_items_in_cart", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET List of Cart Items$")
	public void I_GET_list_of_cart_items(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_list_of_cart_items", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I POST My Login Id$")
	public void I_POST_my_login_id(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_POST_my_login_id", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I POST Wishlist Items with (\\d+)$")
	public void I_POST_wishlist_items(int Itid, int catId) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_POST_wishlist_items", new Class[] {int.class, int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@When("^Itid(\\d+) I GET My Wishlist Items$")
	public void I_GET_my_wishlist_items(int Itid) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		String keyFromMethodAnnotationValue = getKeyFromMethodAnnotationValue(
				this.getClass().getMethod("I_GET_my_wishlist_items", new Class[] {int.class}));
		if (errorMap.size() > 0 && errorMap.containsKey(keyFromMethodAnnotationValue)) {
			Assert.fail(errorMap.get(keyFromMethodAnnotationValue));
		}
	}

	@Then("^display wishlist items$")
	public void testShouldBeSuccessful() throws IOException {
	}

}


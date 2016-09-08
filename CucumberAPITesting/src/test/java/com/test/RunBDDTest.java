package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "features/BassproDemo.feature", plugin = { "pretty", "html:target/site/cucumber-pretty",
		"json:target/cucumber.json" })
public class RunBDDTest extends AbstractTestNGCucumberTests {

}

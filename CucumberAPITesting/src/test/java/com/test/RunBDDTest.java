package com.test;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = false, 
		features = "features", 
		//tags = {"@shopping"},
		//plugin = { "pretty","html:target/site/cucumber-pretty", "json:target/cucumber.json" }
		plugin = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json", "html:target/cucumber-htmlreport", "json:target/cucumber-report.json", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html" }
		)

public class RunBDDTest 
{
	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/java/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("API BDD Demo");
    }

}

#@tag Resource
Feature: JMeterWithCucumberReportTestSteps.java
Scenario: Add and Query Resource
Given I want to execute Sample_RESTAPI.jmx
When I POST Create post resource 
And I GET all post resources to extract id
And I get one post resource
And I get resource comments
Then test should be successful
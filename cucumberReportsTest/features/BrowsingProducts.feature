@tag
Feature: BrowsingProductsSteps.java
	
@tag1
Scenario: Browsing Products
Given I want to execute NikeVirtualServicesDemo.jmx
When I GET List of Top Menus
	And I GET List of Fishing Categories
	And I GET List of Boating Categories
	And I GET List of Hunting Categories
	And I GET List of Fishing SubCategories
	And I GET List of Boating SubCategories
	And I GET List of Hunting SubCategories
Then displays products
	


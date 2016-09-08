@ShoppingScenario 
Feature: Guest Add to Cart and Verify Cart items sceanario 

@tag1 
Scenario Outline: Guest Add to Cart 

	Given I want to execute guest add to cart sceanario 
	When Itid<Itid> I GET List of Guest Top Menus 
	And Itid<Itid> I GET List of Guest Fishing Categories 
	And Itid<Itid> I GET List of Guest Boating Categories 
	And Itid<Itid> I GET List of Guest Hunting Categories 
	And Itid<Itid> I GET List of Guest Fishing SubCategories 
	And Itid<Itid> I GET List of Guest Boating SubCategories 
	And Itid<Itid> I GET List of Guest Hunting SubCategories 
	And Itid<Itid> I GET List of Guest Product Details 
	And Itid<Itid> I POST Items in Guest Cart 
	And Itid<Itid> I GET List of Guest Cart Items 
	Then display guest add results 
	
	Examples: 
		| Itid |
		|    1 |
		|    2 |
		|    3 |
		|    4 |
		|    5 |
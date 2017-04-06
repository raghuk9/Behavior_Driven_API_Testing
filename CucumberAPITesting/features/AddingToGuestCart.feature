@shopping
Feature: BrowsingAndCartScenario

    Scenario Outline: Browsing Products
    Given I want to execute BrowsingProducts.jmx
    When Itid<Itid> I GET List of Browsing Top Menus
    And Itid<Itid> I GET List of Browsing Fishing Categories
    And Itid<Itid> I GET List of Browsing Boating Categories
    And Itid<Itid> I GET List of Browsing Hunting Categories
    And Itid<Itid> I GET List of Browsing Fishing SubCategories
    And Itid<Itid> I GET List of Browsing Boating SubCategories
    And Itid<Itid> I GET List of Browsing Hunting SubCategories
    Then display browsing products
 
 Examples: 
      | Itid |
      |    1 |
      |    2 |
      |    3 |
      |    4 |
      |    5 |
    
 
  Scenario Outline: Adding To Guest Cart Scenario
    Given I want to execute AddingToGuestCartScenario.jmx
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
    Then display Guest Cart items   

Examples: 
      | Itid | 
      |    1 | 
      |    2 | 
      |    3 | 
      |    4 |
      |    5 |
 
   
@wishlist
Feature: Wishlist Scenario
  
  Scenario Outline: Adding Wishlist Items
    Given I want to execute WishlistScenario.jmx
    When Itid<Itid> I GET List of Top Menus
    And Itid<Itid> I GET List of Fishing Categories
    And Itid<Itid> I GET List of Boating Categories
    And Itid<Itid> I GET List of Hunting Categories
    And Itid<Itid> I GET List of Fishing SubCategories
    And Itid<Itid> I GET List of Boating SubCategories
    And Itid<Itid> I GET List of Hunting SubCategories
    And Itid<Itid> I GET List of Product Details
    And Itid<Itid> I POST Items in Cart
    And Itid<Itid> I GET List of Cart Items
    And Itid<Itid> I POST My Login Id
    And Itid<Itid> I POST Wishlist Items with <catId>
    And Itid<Itid> I GET My Wishlist Items
    Then display wishlist items

    Examples: 
      | Itid | catId |
      |    1 | 84338 |
      |    2 | 84367 |
      |    3 | 84300 |
      |    4 | 78338 |
      |    5 | 86638 |

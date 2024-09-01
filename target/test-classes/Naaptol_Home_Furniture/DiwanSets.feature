
@tag
Feature: DiwanSets feature
  I want to use this template for my feature file

  @DiwanSets
  Scenario: User should move to the Diwan sets page
    Given Open Browser and enter Naaptol url and search
    And Hover on Shopping Category and Home Linen Furnishing
    When Click on Diwan Sets tab
    Then Assert if the user is redirected to Diwan Sets page
    
   @DiwanSets
  	Scenario: User should able to click on COD Checkbox
    Given Open Browser and enter Naaptol url and search
    And Hover on Shopping Category and Home Linen Furnishing
    When Click on Diwan Sets tab
    And Click on Cash On Delivery Checkbox 
    Then User should able to click search 
    
    @DiwanSets
  	Scenario: User should able to click on Free Delivery Checkbox
    Given Open Browser and enter Naaptol url and search
    And Hover on Shopping Category and Home Linen Furnishing
    When Click on Diwan Sets tab
    And Click on Free Delivery Checkbox 
    Then User should able to search 
    
    @DiwanSets
  	Scenario: User should able to Compare products 
    Given Open Browser and enter Naaptol url and search
    And Hover on Shopping Category and Home Linen Furnishing
    When Click on Diwan Sets tab
    And Click on Add compare tab of different products
    
    @DiwanSets
  	Scenario: User should able to Sort products 
    Given Open Browser and enter Naaptol url and search
    And Hover on Shopping Category and Home Linen Furnishing
    When Click on Diwan Sets tab
    And Sort products by Most Expensive
    
    
    
    

  
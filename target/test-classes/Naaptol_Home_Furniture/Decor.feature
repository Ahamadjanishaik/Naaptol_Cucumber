@Decor
Feature: Decor
  I want to use this template for my feature file

  @TitleValidate
  Scenario: To validate the Decor Category  
    Given Open the browser, enter naaptol url
    And hover on Category, hover on Home and Furniture
    When Click on Decor link
    Then Assert title of the page 
    
  @ClickCheckbox
  Scenario: To validate the Decor Category  
    Given Open the browser, enter naaptol url
    And hover on Category, hover on Home and Furniture
    When Click on Decor link
    Then Click on COD checkbox 
    
  @ClickOnBuyNow
  Scenario: To validate the Decor Category  
    Given Open the browser, enter naaptol url
    And hover on Category, hover on Home and Furniture
    When Click on Decor link
    And Click on 1st product, click on Buy Now, proceed to checkout
    Then  Assert the output 

  
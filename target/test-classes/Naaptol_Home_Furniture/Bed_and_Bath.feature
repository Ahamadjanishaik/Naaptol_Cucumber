@Bed_and_Bath
Feature: Bed & Bath feature
  I want to use this template for my feature file

  @TitleValidate
  Scenario: To validate the Bed and Bath Category  
    Given User Opens the browser, enters naaptol url
    And hovers on Category, hovers on Home and Furniture
    When Clicks on Bed and Bath link
    Then Asserts title of the page 
    
   @ClickOnBuyNow
  Scenario: To validate the Bed and Bath Category  
    Given User Opens the browser, enters naaptol url
    And hovers on Category, hovers on Home and Furniture
    When Clicks on Bed and Bath link
    And Clicks on 1st product, Clicks on Buy Now, Proceed to checkout
    Then  Assert the login output 
  

  

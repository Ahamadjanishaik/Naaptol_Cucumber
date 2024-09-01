@BedSheets
Feature: BedSheeets
  I want to use this template for my feature file

  @tag1
  Scenario: User should move to BedSheets page 
    Given User opens the browser, visits the naaptol webpage
    And hovers on Shopping Category, hovers on Home and Furniture tab
    When Clicks on BedSheets Tab     
    Then User should move to the Bedsheets page 
    
  Scenario: User should able click on checkbox 
    Given User opens the browser, visits the naaptol webpage
    And hovers on Shopping Category, hovers on Home and Furniture tab
    When Clicks on BedSheets Tab     
    And User clicks on price range checkbox 
    
   Scenario: User should able add products to wishlist 
    Given User opens the browser, visits the naaptol webpage
    And hovers on Shopping Category, hovers on Home and Furniture tab
    When Clicks on BedSheets Tab     
    And User adds one product to wishlist
    Then Login Page should display  
    
    Scenario: User should able to Sort products  
    Given User opens the browser, visits the naaptol webpage
    And hovers on Shopping Category, hovers on Home and Furniture tab
    When Clicks on BedSheets Tab     
    And User selects Sort by dropdown 
    
    Scenario: User should able to add product to cart
    Given User opens the browser, visits the naaptol webpage
    And hovers on Shopping Category, hovers on Home and Furniture tab
    When Clicks on BedSheets Tab     
    And Click on product Click on Buy Now   
    Then User should move to the LoginPage
    
    
    
    

  
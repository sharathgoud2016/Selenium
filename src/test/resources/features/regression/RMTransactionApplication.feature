@watchlist @watchlist-critical
Feature: EPIC WRA-146-Transaction Application User Stories WRA-393 WRA-305 WRA-303 WRA-302 WRA-301 WRA-299 WRA-176 WRA-775

  #-----------------WRA-------------
  @regression750 @regression393 @regression146 @regression02
  Scenario: WRA-750- Verify-Local currency funds label and tick box
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When RM user search fund section.
    Then User able to see default filters ALL risk categories, ALL asset classes, ALL fund types and Local currency funds.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression757 @regression393 @regression146 @regression02
  Scenario: WRA-757- Verify-Local currency funds tag and tick box is defaulted
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When Click on Filter Fund under transaction page.
    Then User able to see local currency fund tag.
    And Tick box is defaulted at search filter.
    And User unable to untick the local currency.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression758 @regression302 @regression146 @regression02
  Scenario: WRA-758- Transaction application -Filter funds by multiple criteria
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When Click on Filter Fund under transaction page.
    Then RM user able to see risk Category, asset class, fund type.
    #And User selects multiple criteria under transaction page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression759 @regression302 @regression146 @regression02
  Scenario: WRA-759- Application transaction- filtering funds by multiple criteria
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When User selects multiple criteria under transaction page.
    Then User able to see funds on selected multiple criteria.
    #And Display fund names alphabetically.
    And User click on logout button in RMA Application
    And User should click on Continue Button
    
    
  @regression760 @regression302 @regression146 @regression02
  Scenario: WRA-760-Transaction application- All risk categories, All asset classes, All fund types, are selected by default at search filter
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When RM user search fund section.
    Then User able to see default filters ALL risk categories, ALL asset classes, ALL fund types and Local currency funds. 
    When User selects multiple criteria under transaction page.
    Then User able to see funds on selected multiple criteria.
    And User click on logout button in RMA Application
    And User should click on Continue Button
    
  @regression761 @regression302 @regression146 @regression02
  Scenario: WRA-761- Transaction application- Verify by clicking on the 'x' button on the filter tag whether filter remove or not
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When User verifies by clicking on the 'x' button on the filter tag at search filters.
    Then It should remove filter or selection at filter search.
    When User selected or ticked even criteria at search filter.
    Then User able to see reset button should be enabled at search filter.
    And User click on logout button in RMA Application
    And User should click on Continue Button 
    
    
  @regression762 @regression302 @regression146 @regression02
  Scenario: WRA-762- Transaction application- Click on reset Filter, the filter should reset to default setting.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When RM user search fund section.
    Then User able to see default filters ALL risk categories, ALL asset classes, ALL fund types and Local currency funds. 
    And User click on logout button in RMA Application
    And User should click on Continue Button
     
    
  @regression727 @regression299 @regression146 @regression02
  Scenario: WRA-727- Transaction application -Filter funds by Asset Class
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When Click on Filter Fund under transaction page.
    Then RM user able to see risk Category, asset class, fund type.
    And User able to apply selected filter.
    And User click on logout button in RMA Application
    And User should click on Continue Button
    
    
    
  @regression728 @regression299 @regression146 @regression02
  Scenario: WRA-728- Application transaction- filtering funds by asset class.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When RM user select one or more asset classes under transaction page.
    Then User able to see funds related to selected asset class.
    #And Display fund names alphabetically.
    And User click on logout button in RMA Application
    And User should click on Continue Button
    
    
  @regression729 @regression299 @regression146 @regression02
  Scenario: WRA-729- Transaction application- filters are selected by default at search filter
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When RM user search fund section.
    Then User able to see default filters ALL risk categories, ALL asset classes, ALL fund types and Local currency funds. 
    When RM user select one or more asset classes under transaction page.
    Then User able to see only selected assets as filter tags
    And User click on logout button in RMA Application
    And User should click on Continue Button
    
    
  @regression730 @regression299 @regression146 @regression02
  Scenario: WRA-730-Transaction application- Verify by clicking on the 'x' button on the filter tag whether filter remove or not 
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing second customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When RM user clicks on new transaction under customer profile page.
    Then User able to see transaction application page.
    When User verifies by clicking on the 'x' button on the filter tag at search filters for asset class.
    Then It should remove filter or selection at filter search for asset class.
    And User click on logout button in RMA Application
    And User should click on Continue Button
    
    
    
    
    
    

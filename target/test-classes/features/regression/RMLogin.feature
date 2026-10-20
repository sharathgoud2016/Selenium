@watchlist @watchlist-critical
Feature: EPIC WRA-137-Logins User Stories WRA-206 - RM Login WRA-291 - RM logout and WRA-456-Inactivity Session

  @regression505 @regression206 @regression137 @regression01
  Scenario: WRA-505 -Verify as a RM user should able to login to RMA application with valid LAN credentials.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression506 @regression206 @regression137 @regression01
  Scenario: WRA-506 -To verify the RMA application access with invalid LAN credentials(Id/Password).
    Given I am on login page
    Then User should able to see LAN ID and password is invalid.Please try again.

  @regression507 @regression206 @regression137 @regression01
  Scenario: WRA-507 -To verify the RMA application access with invalid LAN credentials(Id/Password).
    Given I am on login page
    When User inputs a valid LAN user id and Password

  #-------------------User Story WRA-291 - RM Logout Scenarios-----------------
  @regression508 @regression291 @regression137 @regression01
  Scenario: WRA-508 -Verify logout prompt window
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should able to see a confirmation pop up which consists of cancel and continue buttons
    And User should click on Continue Button

  @regression509 @regression291 @regression137 @regression01
  Scenario: WRA-509 -[Logout] Cancel button behavior
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should able to see a confirmation pop up which consists of cancel and continue buttons
    And User should click on Cancel Button
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression510 @regression291 @regression137 @regression01
  Scenario: WRA-510 -[Logout] Continue button behavior
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should able to see a confirmation pop up which consists of cancel and continue buttons
    And User should click on Continue Button

  #----------------User Story WRA-456 Inactivity Session----------------
  @regression511 @regression456 @regression137 @regression01
  Scenario: WRA-511 -Verify Login - Inactivity session (logout) prompt window.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When RM lands on dashboard user did not perform any activity for five minutes
    Then User should see the Session Inactivity popup displays with message

  @regression517 @regression456 @regression137 @regressionfailed
  Scenario: WRA-517 -Verify continue Session button functionality from Session inactivity prompt window.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When RM lands on dashboard user did not perform any activity for five minutes
    Then User should see the Session Inactivity popup displays with message
    When User click on Continue Session button from session inactivity prompt window in dashboard section.
    Then User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should able to see a confirmation pop up which consists of cancel and continue buttons
    And User should click on Cancel Button
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression518 @regression456 @regression137 @regression01
  Scenario: WRA-518 -Verify by closing pop up in Session inactivity prompt window, user stay back on same page.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should able to see a confirmation pop up which consists of cancel and continue buttons
    And User should click on Continue Button

  @regression519 @regression456 @regression137 @regression01
  Scenario: WRA-519 -Verify auto logged out due to inactivity session
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should able to see a confirmation pop up which consists of cancel and continue buttons
    And User should click on Continue Button

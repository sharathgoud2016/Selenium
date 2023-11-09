@watchlist @watchlist-critical
Feature: EPIC WRA-142-Customer Profile User Stories WRA-165 WRA-607

  #------------------------------
  @regression513 @regression165 @regression142 @regression01
  Scenario: WRA-513 -Verify Customer Profile Skeleton Page Buttons & Investment Details
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression546 @regression165 @regression142 @regression01
  Scenario: WRA-546 -Verify the customer Investment details from Customer Investment  Profile page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    Then User should be  able to see all the  customer Investment details from Cust Invt Prf page FullName and IDNumber.
    And Risk Profile Aggressive, Balanced, Moderate, Growth
    And Customer Details Personal Details Contact Information Other Personal Details Address Mailing Address Employment Details.
    And Buttons for New Account & New Transaction
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression547 @regression165 @regression142 @regression01
  Scenario: WRA-547 -Verify Customer Holdings, Application Status and Total Portfolio from Customer profile page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User verify for Total Portfolio under Customer profile section
    Then User able to see Over wealth Pie chart Savings Fixed deposit Investments Expenses Loan and Financing.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression676 @regression607 @regression142 @regression01
  Scenario: WRA-676 -Verify Customer Applications - List & status-Product Selection Filter.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User click on application status tab under Customer profile section
    Then User should able to see product selection filter UT is selected by default  highlighted in red color.
    And User able to see Filter Section like Creation date Transaction type Application status.
    And User able to see All attributes values Application creation date Tran type App ref ID App status.
    And User should see Created on have a sorting icon up & down arrow.
    And User should see Arrow link to see application details.
    And Pagination setting verify
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression690 @regression607 @regression142 @regression01
  Scenario: WRA-690 -Verify Customer Applications - List & status-RMA channel
    Given I am on login page
    Then The User Successfully able to access RMA application
    When Verify user is on Customer A profile page.
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User click on application status tab under Customer profile section
    Then User unable to see the transactions that are done by other RMsstaff for Customer A.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression486 @regression655 @regression02
  Scenario: WRA-655 -Verify table sorting under Customer Holdings.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    And User able to see fund name by ascending alphabetical order by default under customer holdings section.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression486 @regression666 @regression02
  Scenario: WRA-666 -Verify transaction records when clicks on fund name, under the customer holdings.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    Then Transaction records should be display descending alphabetical order.
    And Transaction records  should be sorted by ascending alphabetical order.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression486 @regression672 @regression02
  Scenario: WRA-672 -Verify transaction records, when clicks on NAV(MYR) under the customer holdings.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    Then The result should return to lowest to highest NAV and Transaction records should be sorted highest to lowest.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression486 @regression673 @regression02
  Scenario: WRA-673 -Verify transaction records when clicks on ROI, under the customer holdings.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    And The result should return to lowest to highest ROI and Transaction records should be sorted highest to lowest.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression458 @regression692 @regression02
  Scenario: WRA-692 -Customer holdings - Pagination- Next Page.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User clicks on  next page under customer holdings section.
    Then User able to see the customer holdings listed in Next Page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression458 @regression693 @regression02
  Scenario: WRA-693 -Customer holdings - Pagination- Previous Page.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User clicks on  next page under customer holdings section.
    Then User able to see the customer holdings listed in Previous Page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression458 @regression694 @regression02
  Scenario: WRA-694 -Customer holdings - Pagination- First and last page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    And User able to see the first and last page directly
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression458 @regression695 @regression02
  Scenario: WRA-695 -Customer holdings - Pagination- Previous and Next page Disable
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When Verify Customer is on last page under customer holdings section
    Then User able to see the Next page is Disable as per the wire in Customer Holdings
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression458 @regression696 @regression02
  Scenario: WRA-696 -Verify customer holdings - Pagination- Number of holdings per page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    And User can see the total number of records for the page is 1-05 of 05 records as per the wire
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression304 @regression808 @regression02
  Scenario: WRA-808 -Verify Subscribe -Inactive Funds -Fund Holiday
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User clicks on New Transaction under customer profile section
    Then User verify inactive fund in search fund listing  under  transaction application page.
    And User should able to see Fund holiday label.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression304 @regression809 @regression02
  Scenario: WRA-809 -Verify Subscribe -Inactive Funds -Fund Holiday label
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User clicks on New Transaction under customer profile section
    Then User verify inactive fund in search fund listing  under  transaction application page.
    And User should able to see Fund holiday label.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression304 @regression810 @regression02
  Scenario: WRA-810 -Verify Subscribe -Inactive Funds -Inactive fund in my customer Investment Dashboard
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User clicks on New Transaction under customer profile section
    Then User verify inactive fund in search fund listing  under  transaction application page.
    And User should able to see Fund holiday label.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression304 @regression811 @regression02
  Scenario: WRA-811 -Verify Subscribe -Inactive Funds -Inactive fund in my customer Investment Dashboard
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should be to view the Customer details from customer profile page.
    When User clicks on New Transaction under customer profile section
    Then User verify inactive fund in search fund listing  under  transaction application page.
    And User should able to see Fund holiday label.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression215 @regression875 @regression02
  Scenario: WRA-875 -Verify Customer Profile -Customer has no valid risk Profile when customer is NTP.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When Customer has  no valid risk Profile under customer profile section.
    Then User should able to see New Account and New Transaction button will be disabled.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression215 @regression876 @regression02
  Scenario: WRA-876 -Verify Customer Profile -If RPQ is valid when customer is NTP.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section with Button Enabled.
    Then User should able to see New Account and New Transaction button will be enabled.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression215 @regression877 @regression02
  Scenario: WRA-877 -Verify Customer Profile -Customer has no valid risk Profile when customer is ETP.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section.
    Then User should able to see New Account and New Transaction button will be enabled.
    And User able to perform fund redemption even without a valid risk profile
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression142 @regression215 @regression878 @regression02
  Scenario: WRA-878 -Verify Customer Profile -RPQ is valid when customer is ETP.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for the existing customer details under RMA dashboard section with Button Enabled.
    Then User should able to see New Account and New Transaction button will be enabled.
    And User able to perform fund redemption even without a valid risk profile
    And User click on logout button in RMA Application
    And User should click on Continue Button

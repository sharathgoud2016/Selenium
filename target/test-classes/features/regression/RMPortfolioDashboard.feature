@watchlist @watchlist-critical
Feature: EPIC WRA-140-RM Portfolio Dashboard User Stories WRA-251 WRA-252 WRA-255 WRA-248 WRA-249 WRA-250

  #-----------------WRA-252 RM Dashboard - Change Year drop list-------------
  @regression560 @regression252 @regression140 @regression01
  Scenario: WRA-560 -Verify User want to view the total subscription for year 2021 from Drop down list
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select the particular year from the total subscription transactions drop down list under RMA dashboard section.
    Then User should able to see the selected year 20XX from the drop down list of total subscription. transactions.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression564 @regression252 @regression140 @regression01
  Scenario: WRA-564 -Verify Total Subscription Amount for the last 3 years.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select the particular year from the total subscription transactions drop down list under RMA dashboard section.
    When User verify Total Subscription Amount for the selected year from total subscription transaction section
    Then User should able to see the change in total Subscription Amount for the last 3 years
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression563 @regression252 @regression140 @regression01
  Scenario: WRA-563 -Verify the chart details will change accordingly when different year is selected
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select the particular year from the total subscription transactions drop down list under RMA dashboard section.
    When User verify Total Subscription Amount for the selected year from total subscription transaction section
    Then User should able to see the chart details for the selected year.
    And Details will change accordingly to the year user which is selected.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  #----------------------------User Story WRA-248-----------------------
  @regression514 @regression248 @regression140 @regression01
  Scenario: WRA-514 -Verify RM Dashboard - RM Greeting & Skeleton Dashboard Page.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression515 @regression248 @regression140 @regression01
  Scenario: WRA-515 -Verify RM user can able to see New Transaction on RMA Dashboard page.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    And New Account and New Transaction CTA hyperlink exists.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression516 @regression248 @regression140 @regression01
  Scenario: WRA-516 -Verify RM user can able to see the skeleton cart fields in the RMA Dashboard page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User is on Application Status under RMA dashboard section.
    Then User should able to see Created On ddmmyyyy time
    And Customer Name should be displayed
    And Type Bundle Subscribe Redeem New Account displayed
    #   And Reference ID number or Passport Number displayed
    #   And Status Rejected Confirmed Pending Approval Draft should be displayed
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression566 @regression250 @regression140 @regression01
  Scenario: WRA-566 -Verify the total subscription amount should be displayed on the left side of the chart.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    When User should land on RMA dashboard page.
    Then Amount should be displayed on the left side of the chart MYR amount
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression567 @regression250 @regression140 @regression01
  Scenario: WRA-567 -Verify year displayed on the title should be dynamic as per the current year
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    When User should land on RMA dashboard page.
    When User select the particular year from the total subscription transactions drop down list under RMA dashboard section.
    Then User should able to see the selected year 20XX from the drop down list of total subscription. transactions.
    And User should able to see the year displayed on the title should be dynamic as per the Selected year.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression571 @regression250 @regression140 @regression01
  Scenario: WRA-571 -Verify Total Subscription amount
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify Total Subscription amount  under RMA dashboard section.
    # Then Then User should able to add Sum of all transaction amount Total recorded subscription amount
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression572 @regression250 @regression140 @regression01
  Scenario: WRA-572 -Verify the last updated date and time is shown.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id one and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify  the  last updated date and time from total subscription transaction section.
    Then User should able to view the last updated date and time below the total amount as per the wire frame.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression629 @regression255 @regression140 @regression01
  Scenario: WRA-629 -Verify User able to see the Total month to date for UT transaction
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify UT transaction under total subscription transactions section.
    Then User should able to see the Total month to date for UT transaction in the grey box on the left.
    And The amount should be MYR month.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression630 @regression255 @regression140 @regression01
  Scenario: WRA-630-Verify User able to see the growth in percentage for Unit Trust amount
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify growth in percentage for Unit Trust amount under total subscription transaction section.
    Then User able to see the current M.O.M and growth in percentage month to date.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression632 @regression255 @regression140 @regression01
  Scenario: WRA-632 -Verify User to view month-to-date transaction growth for UT
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify month-to-date transaction growth for UT under Total subscription transaction section.
    Then User able to see the Increase arrow in Green color.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression827 @regression763 @regression140 @regression02
  Scenario: WRA-827 -Verify Last Updated date & time on Dashboard
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verifies current year at the total subscription transactions section.
    Then User should be view the last updated date on total subscription transactions section.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression803 @regression763 @regression140 @regression02
  Scenario: WRA-803 -Verify Last Updated date & time on Dashboard
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select the 2021 year from the drop down list under total subscription transactions section.
    Then User should be shown the year to date transaction made by the RM under the total subscription transactions section on dashboard page.
    When User verifies current year at the total subscription transactions section.
    Then User should be view the last updated date on total subscription transactions section.
    When User see the data and values under the total subscription transactions section.
    Then It should be displayed as month to date e.g. Last updated on 23 Jun 2022, 8:01 PM
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression830 @regression763 @regression140 @regression02
  Scenario: WRA-830 -Verify Last Updated date & time on Dashboard
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User see the data and values under the total subscription transactions section.
    Then It should be displayed as month to date e.g. Last updated on 23 Jun 2022, 8:01 PM
    When User verifies the past years according to the data and values.
    Then User should able to view last updated date under the total subscription transactions section.
    And User click on logout button in RMA Application
    And User should click on Continue Button

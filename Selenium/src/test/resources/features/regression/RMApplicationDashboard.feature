@watchlist @watchlist-critical
Feature: EPIC WRA-141-Application Dashboard User Stories WRA-261 WRA-257 WRA-258 WRA-601 WRA-602 WRA-259 WRA-260 WRA-296 WRA-253 WRA-221  WRA-222 WRA-223 WRA-224 WRA-295

  #-----------------WRA-------------
  @regression561 @regression261 @regression141 @regression01
  Scenario: WRA-561 -Verify UT product selected by default.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify the application status in RMA dashboard section.
    Then User should able to see the UT product as highlighted as Red color as per the wire attached.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression562 @regression261 @regression141 @regression01
  Scenario: WRA-562 -Verify Product selection filter.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User selects other wealth product type under Application status section.
    Then User should able to to see ASNB list of applications for selected products.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression640 @regression257 @regression141 @regression01
  Scenario: WRA-640 -Verify Application Dashboard - Filter by date
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User click on creation date under Application status section.
    Then User Should able to see a dropdown selection to a select desired transaction records.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression641 @regression257 @regression141 @regression01
  Scenario: WRA-641 -Verify Application Dashboard -Time Period Result displayed
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User click on filter button for selected desire time period under Application Status section.
    Then User should able to see drop down will disappear.
    And User see the list of all transactions platform displayed between the period selected.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression691 @regression257 @regression141 @regression01
  Scenario: WRA-691 - Verify Application Dashboard - Result displayed
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify Result under Application Status section.
    Then User should able to see NO Results Found as per the wire frame.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression642 @regression258 @regression141 @regression01
  Scenario: WRA-642 -Application Dashboard - Filter by transaction type-Subscribe.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Click on Subscribe from filter by type under Application Status section.
    Then User Should only see the subscribe transactions are displayed.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression643 @regression258 @regression141 @regression01
  Scenario: WRA-643 -Verify Application Dashboard - Filter by transaction type-Redeem
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Click on Redeem from filter by type under Application Status section.
    Then User Should only see the Redeem transactions are displayed.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression644 @regression258 @regression141 @regression01
  Scenario: WRA-644 -Verify Application Dashboard - Filter by transaction type-Switch
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Click on Switch from filter by type under Application Status section.
    Then User Should only see the Switch transactions are displayed.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression645 @regression258 @regression141 @regression01
  Scenario: WRA-645 -Verify Application Dashboard - Filter by transaction type-Bundle
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Click on Bundle from filter by type under Application Status section.
    Then User Should only see the Bundle transactions are displayed.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression647 @regression258 @regression141 @regression01
  Scenario: WRA-647 -Verify Application Dashboard - Filter by transaction type-Risk profile update
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Click on Risk profile update from filter by type under Application Status.
    Then User Should only see then Risk profile update transactions are displayed.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression648 @regression258 @regression141 @regression01
  Scenario: WRA-648 -Verify Application Dashboard - Filter by transaction type-Risk profile update
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Click on All from filter by type under Application Status section.
    Then User Should see multiple types of transactions displayed All respective transaction types accordingly.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression650 @regression601 @regression141 @regression01
  Scenario: WRA-650 -Verify Application Dashboard - Apply filter- customer applications
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User clicked one or more filter criteria for Customer application under application status section.
    Then User should able to see the selected funds that meet the criteria.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression654 @regression601 @regression141 @regression01
  Scenario: WRA-654 - Verify Application Dashboard - Apply filter- No application found
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User click on filter for no records under application status section.
    Then User should able to see no results found and can see appropriate message as per the wire frames.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression656 @regression601 @regression141 @regression01
  Scenario: WRA-656 -Verify Application Dashboard - Reset Button disabled
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User applied NO values in filter under Applications status section.
    Then User should able to see Reset button is disabled.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression658 @regression259 @regression141 @regression01
  Scenario: WRA-658 -Verify Application Dashboard - Filter by application status- Completed.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User clicks on Completed from filter by status under application status section.
    Then User should able to see only the selected filter Completed status.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression659 @regression259 @regression141 @regression01
  Scenario: WRA-659 -Verify Application Dashboard - Filter by application status- Pending approval.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User clicks on Pending approval from filter by status under application status section.
    Then User should able to see only the selected filter as Pending approval status.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression660 @regression259 @regression141 @regression01
  Scenario: WRA-660 -Verify Application Dashboard - Filter by application status- Rejected
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User clicks on Rejected from filter by status under application status section.
    Then User should able to see only the selected filter as Rejected status.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression661 @regression259 @regression141 @regression01
  Scenario: WRA-661 -Verify Application Dashboard - Filter by application status- Draft
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User selects All from filter by status under Application status section
    Then User should able to see multiple status to the respective transaction status accordingly.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression662 @regression259 @regression141 @regression01
  Scenario: WRA-662 -Verify Application Dashboard - Filter by application status-Processing
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User clicks on Processing from filter by status under application status section.
    Then User should able to see only the selected filter as Processing status.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression663 @regression259 @regression141 @regression01
  Scenario: WRA-663 - Verify Application Dashboard - Filter by application status- Result.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User search for Result.
    Then User should able to see the Empty result as per the wire frame.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression664 @regression259 @regression141 @regression01
  Scenario: WRA-664 -Verify Application Dashboard - Filter by application status-All or Multiple Status.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User selects All from filter by status under Application status section
    Then User should able to see multiple status to the respective transaction status accordingly.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression665 @regression296 @regression141 @regression01
  Scenario: WRA-665 -Application Dashboard - No records
    Given I am on login page
    Then The User Successfully able to access RMA application
    When Verify user is on Customer A profile page.
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User lands on the RMA application for first time.
    Then User should not see any data in the application in RMA dashboard as per the design.
    And User able to see the Application dashboard should remain empty until RM created their first application thru RMA Portal as per the wire frame.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression667 @regression253 @regression141 @regression01
  Scenario: WRA-667 -Application status RM Dashboard - Pagination- Next Page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User clicks on next page under Application Status Section.
    Then User able to see the application status listed in Next Page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression668 @regression253 @regression141 @regression01
  Scenario: WRA-668 - Application status RM Dashboard - Pagination- Previous page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User clicks on Previous page under Application Status Section.
    Then User able to see the application status listed in Previous page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression669 @regression253 @regression141 @regression01
  Scenario: WRA-669 -Application status RM Dashboard - Pagination- First and last page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When Verify user can move directly to the first and last page.
    Then User able to see the first and last page directly.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression670 @regression253 @regression141 @regression01
  Scenario: WRA-670 -Application status RM Dashboard - Pagination- Previous and Next page Disable
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When Verify Customer is on first page under Application Status section.
    Then User able to see the Previous page is Disable as per the wire.
    When Verify Customer is on last page under Application Status section.
    Then User able to see the Next page is Disable as per the wire.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression671 @regression253 @regression141 @regression01
  Scenario: WRA-671 -Verify Application status RM Dashboard - Pagination- Number of records per page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verify number of funds per page.
    Then User able to see the funds per page is 10 as per the wire.
    And User can see the total number of records for the page is 1-10 of 23 records as per the wire.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression619 @regression221 @regression141 @regression01
  Scenario: WRA-619 -Verify List of transaction applications Subscribe under Application Status.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User View at the transaction record under Application Status.
    Then User able to see all the attributes values as per listed in story.
    And see the layout as per design.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression609 @regression222 @regression141 @regression01
  Scenario: WRA-609 -Verify List of transaction from application-Redeem
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Verify Redeem in the transaction record under Application Status section.
    Then User should be able to see the Redeem transaction type.
    And User able to see all Redeem attributes values as per listed in story as per layout design.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression610 @regression223 @regression141 @regression01
  Scenario: WRA-610 -Verify List of transaction applications - Switch
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Verify Switch in the transaction record under Application Status section.
    Then User should able to see the switch transaction type .
    And User able to see all Switch attributes values as per listed in story as per layout design.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression604 @regression224 @regression141 @regression01
  Scenario: WRA-604 -Verify  List of transaction from Application Status Section
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Verify Bundle in the transaction record under Application Status section.
    Then User Should able to see all the Bundle transaction type.
    And User able to see Bundle attributes values as per listed in story as per layout design.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression603 @regression295 @regression141 @regression01
  Scenario: WRA-603 -Verify List of transaction applications - RPQ from Application Dashboard section
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Verify RPQ update in the transaction record under Application Status section.
    Then User Should able to see RPQ update transaction type.
    And User able to see the all RPQ attributes values as per listed in story as per layout design.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression677 @regression260 @regression141 @regression01
  Scenario: WRA-677 -Verify transaction records sorted by descending ‘Z to A' alphabetical order under application status.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When Verify Customer Asc and Dec order after click on Customer Column
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression674 @regression260 @regression141 @regression01
  Scenario: WRA-674 -Verify transaction date with latest/newest date on top by default under application status.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When Verify Transaction date should display latest to newest date on top by default
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression675 @regression260 @regression141 @regression01
  Scenario: WRA-675 -Verify transaction records when clicks on created on, under application status.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When Verify transaction records when clicks on created on, under application status.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression860 @regression793 @regression141 @regression02
  Scenario: WRA--860-Verify to remove "Wealth" drop down from top page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User verifies at top page on dashboard.
    #Then User should see wealth dropdown portion is removed from all the screens on dashboard page.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression890 @regression789 @regression141 @regression02
  Scenario: WRA--890-Verify Remove New Account type from transaction type filter
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select Customer ID number under RMA dashboard section
    Then User land on customer profile page
    When User select Transaction Type Filter from application status on customer profile page
    Then User can't see the new account type from transaction type filter
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression937 @regression423 @regression141 @regression02
  Scenario: WRA-937-Verify Filter behavior at Application status on main dashboard
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User Selecting All will not auto-select all selection in filter bar on application status section.
    And Click anywhere outside of filter area.
    Then User able to see only display ‘All’ in the filter bar on application status section.
    When user select other selection not All selection and check on the checkbox.
    #Then “All” option will be unchecked in filter list.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression939 @regression423 @regression141 @regression02
  Scenario: WRA-939-Verify Filter behavior at Application status on customer profile page
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select customer name in RMA Dashboard.
    Then User Should land on the customer Profile page
    When User Selecting All will not auto-select all selection in filter bar on application status section on CP.
    And Click anywhere outside of filter area.
    Then User able to see only display All in the filter bar on application status section.
    When user select other selection not All selection and check on the checkbox in CP.
    #Then “All” option will be unchecked in filter list.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression925 @regression423 @regression141 @regression02
  Scenario: WRA-925-Verify Transaction history duration
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select last 3 months in Filter by creation date in application status section on RMA Dashboard.
    Then User able to see Application history should only available for the last 3 months or last 93 days from today’s date.
    And User click on logout button in RMA Application
    And User should click on Continue Button

  @regression926 @regression423 @regression141 @regression02
  Scenario: WRA-926-Verify User select filter by creation date and select last 3 month, the screen shows default setting.
    Given I am on login page
    Then The User Successfully able to access RMA application
    When User inputs a valid LAN user id and Password
    Then The User Successfully Logged into RMA system
    And User should land on RMA dashboard page.
    When User select customer name in RMA Dashboard.
    Then User Should land on the Customer profile page
    When User select filter by creation date and select last 3 month in application status section.
    Then User should able to see all transactions within the last 3 months.
    And User click on logout button in RMA Application
    And User should click on Continue Button

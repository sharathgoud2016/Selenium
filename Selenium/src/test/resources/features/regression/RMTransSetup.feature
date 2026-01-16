@watchlist @watchlist-critical
Feature: EPIC WRA-160-Transaction SetUp User Stories WRA-462 WRA-330 WRA-231 WRA-172 WRA-422 WRA-307 WRA-207 WRA-174

  #-----------------WRA-737-------------
  @regression160 @regression462 @regression737 @regression02
  Scenario: WRA-737- Verify Transaction - Referral Details
    Given I am on login page

  # When User inputs a valid LAN user id one and Password
  #-----------------WRA-737-------------
  @gowri03
  Scenario Outline: WRA-737- Verify Transaction - Referral Details
    Given I am on login page
    When user inputs a valid LAN "<userid>" and "<Password>"

    Examples: 
      | userid              | Password      |
      | gowris036@gmail.com | Bangalore@123 |

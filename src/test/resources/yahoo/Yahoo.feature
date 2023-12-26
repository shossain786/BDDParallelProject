Feature:  Verify Yahoo page home Screen

  Background: Pre requisite of the tests
    Given I navigate to yahoo page

  Scenario: Verify EMail link click working
    When I click on the email link
    Then I should see label of the Email page is "Sign in to Yahoo Mail"
    And  I close the browser


  Scenario: Verify Finance link click working
    When I click on the Finance link
    Then I should see Title of the Email page is "Yahoo Finance - Stock Market Live, Quotes, Business & Finance News"
    And  I close the browser
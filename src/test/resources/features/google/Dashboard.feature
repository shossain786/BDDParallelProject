Feature:  Verify Google page home Screen

  Background: Pre requisite of the tests
    Given I navigate to google page

  Scenario: Verify EMail link click working
    When I click on the email link
    Then I should see Title of the Email page is "Gmail: Private and secure email at no cost | Google Workspace"
    And  I close the browser


  Scenario: Verify Image link click working
    When I click on the email link
    Then I should see Title of the Email page is "Google Images"
    And  I close the browser
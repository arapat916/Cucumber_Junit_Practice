@search
Feature: google search
  agile story: As a user, I should be able to search on google page

  Background: precondition
    Given user is on the google page


  @smoke
  Scenario: google title verification
    When User input "apple" in google search box
    Then User should see "apple" on page


  Scenario: google title verification
    When User input "blueberry" in google search box
    Then User should see "blueberry" on page

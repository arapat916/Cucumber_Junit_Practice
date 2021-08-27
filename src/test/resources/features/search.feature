Feature: google search
  agile story: As a user, I should be able to search on google page

  @search @smoke
  Scenario: google title verification
    Given User is on the google page
    When User input "apple" in google search box
    Then User should see "apple" on page

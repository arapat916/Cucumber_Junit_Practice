Feature: search
  agile story: As a user, I should be able to search on google page

  Scenario: google title verification
    Given User is on the google page
    Then User should see title is google

Feature: login
  # this is a comment
  @smoke
  Scenario: login as a sales manager
    Given user is on the landing page
    When user logs in
    Then user should see dashboard page
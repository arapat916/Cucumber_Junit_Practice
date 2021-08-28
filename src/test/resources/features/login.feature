Feature: login
  # this is a comment
  @login
  Scenario: login as a sales manager
    Given user is on the landing page
    When user logs in
    Then user should see dashboard page

    @negativeScenario
    Scenario: invalid login
      Given user is on the landing page
      When user logs in with "wrong" username and "wrong" password
      Then user verifies that "Invalid user name or password." message is displayed.

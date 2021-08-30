@search
Feature: google search
  agile story: As a user, I should be able to search on google page

  Background: precondition
    Given user is on the google page


  @smoke
  Scenario: google title verification
    When User input "apple" in google search box
    Then User should see "apple" on page



   @s_o
  Scenario Outline: google searching with data table
    When User input "<word>" in google search box
    Then User should see "<result>" on page

    # autoformatting is ctrl+alt+L
     Examples:
       | word      | result    |
       | apple     | apple     |
       | blueberry | blueberry |
       | pineapple | pineapple |
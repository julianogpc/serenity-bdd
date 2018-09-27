Feature: Search on Google

  Scenario: Search on Google
    Given that I have gone to the Google page
    When I add "cats" to the search box
    And submit the search
    Then "cats" should be mentioned in the results
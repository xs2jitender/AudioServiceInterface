Feature: Example Feature

  @testing
  Scenario: Google produce more than 1 search results
    Given google.com is open
    When I search for India
    Then I see more then 1 search results

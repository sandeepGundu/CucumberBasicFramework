Feature: Flight Selection

  Scenario: Highlight and retain the selected flight
    Given the user has selected a flight from the comparison view
    When the user proceeds to the next booking step
    Then the selected flight should be highlighted
    And the selected flight details should be retained for the booking process
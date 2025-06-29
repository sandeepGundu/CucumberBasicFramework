Feature: Search flights for Round-Trip functionality
  This feature tests the flight search functionality between the given From and To locations for Round-trip

  @SmokeTest
  Scenario: Successful flights search for Round-Trip
    Given user is on the home page
    When user chooses "Flights" from main menu
    Then "Book Domestic and International Flight Tickets" for flights page should be loaded
    When user selects "Round-trip" radio button
    Then From, To, Departure, Return, Travellers & Class dropdown should be displayed
    When user selects From value as "HYD"
    And user selects To value as "BLR"
    And user selects Departure month value as "May 2025" and date value as "31"
    And user selects Return month value as "June 2025" and date value as "2"
    When user clicks Travellers & Class dropdown
    And user selects traveller Adults value as "2"
    And user selects traveller Infants value as "1"
    And user clicks on "economy" option
    And user clicks on done button
    And user clicks on search flights button
    Then search the results section should be displayed

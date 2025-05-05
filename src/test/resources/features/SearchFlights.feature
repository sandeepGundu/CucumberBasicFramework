Feature: Search flights functionality
  This feature tests the flight search functionality between the given From and To locations

  #@SmokeTest
  Scenario: Successful flights search
    Given the user is on the home page
    When the user chooses "Flights" from main menu
    Then "Book Domestic and International Flight Tickets" for flights page should be loaded
    When the user selects "One-way" radio button
    Then "From", "To", "Departure", "Travellers & Class" dropdown should be displayed
    When the user selects "From" value as "HYD"
    And the user selects "To" value as "BLR"
    And the user selects "Departure" month value as "May 2025" and date value as "10"
    When the user clicks "Travellers & Class" dropdown
    And the user selects traveller "Adults" value as "2"
    And  the user selects traveller "Infants" value as "1"
    And the user clicks on "economy" option
    And the user clicks on done button
    And the user clicks on search flights button
    Then the search the results section should be displayed

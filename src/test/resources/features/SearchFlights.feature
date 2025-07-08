Feature: Search flights functionality
  This feature tests the flight search functionality between the given From and To locations

  @SmokeTest
  Scenario Outline: Sort comparison results by key attributes
    Given the user is on the flight comparison view with multiple flights displayed
    When the user selects to sort the flights by <Sort_Attribute>
    Then the flights should be sorted in ascending order based on <Sort_Attribute>

    Examples:
      | Sort_Attribute |
      | Price          |
      | Duration       |
      | Rating         |

  @SmokeTest
  Scenario: Successful flights search
    Given user is on the home page
    When user chooses "Flights" from main menu
    Then "Book Domestic and International Flight Tickets" for flights page should be loaded
    When user selects "One-way" radio button
    Then From, To, Departure, Travellers & Class dropdown should be displayed
    When user selects From value as "HYD"
    And user selects To value as "BLR"
    And user selects Departure month value as "May 2025" and date value as "31"
    When user clicks Travellers & Class dropdown
    And user selects traveller Adults value as "2"
    And user selects traveller Infants value as "1"
    And user clicks on "economy" option
    And user clicks on done button
    And user clicks on search flights button
    Then search the results section should be displayed

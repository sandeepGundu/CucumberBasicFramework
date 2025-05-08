Feature: Search cabs functionality
  This feature tests the cab search functionality between the given From and To locations

  Scenario: Successful cabs search
    Given the user is on the home page
    When the user chooses "Cabs" from main menu
    Then "Book Online Cab" for cabs page should be loaded
    When the user selects "Outstation One-way" radio button
    Then "From", "To", "Pickup Date", "Pickup Time" dropdown should be displayed
    When the user selects "From" value as "HYDERABAD CENTRAL UNIVERSITY"
    And the user selects "To" value as "Sanath Nagar"
    And the user selects "Pickup Date" month value as "May 2025" and date value as "17"
    And the user selects "Pickup Time" value as "10:00 AM"
    And the user clicks on "search cabs" button
    Then the search the results section should be displayed

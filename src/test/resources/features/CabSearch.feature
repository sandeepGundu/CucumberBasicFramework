Feature: Cab Search Functionality

  Scenario: Successful cab search for Outstation Round trip
    Given user is on the home page
    When user chooses "cabs" from main menu
    Then "Book Online Cab" for cabs page should be loaded
    When user selects "Outstation Round trip" radio button
    Then From, To, Pickup Date, Pickup Time, Return Date dropdown should be displayed
    When user selects From value as "Begumpet"
    And user selects To value as "Sanath Nagar"
    When user clicks on Add Stops link to add a stop
    Then user selects "Stop 1" value as "Secunderabad"
    And user selects Pickup Date month value as "June 2025" and date value as "27"
    And user selects Pickup Time value as "12:00 PM"
    And user selects Return Date month value as "June 2025" and date value as "28"
    And clicks on search cabs button
    Then cabs search results should be displayed
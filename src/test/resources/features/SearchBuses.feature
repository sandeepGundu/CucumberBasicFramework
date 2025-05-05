Feature: Search for busses functionality
  This feature tests the bus search functionality between the given From and To locations

  @SmokeTest
  Scenario: Successful bus search
    Given the user is on the home page
    When the user chooses "Bus" from main menu
    Then "Bus Ticket Booking" for Bus page should be loaded
    And "FROM", "TO", "Travel Date", "Today", "Tomorrow" fields should be displayed
    When the user opts "FROM" value as "Hyderabad", "Telangana"
    And the user opts "TO" value as "Vijayawada", "Andhra Pradesh"
    And the user selects "Travel Date" month value as "May 2025" and date value as "10" for the bus
    And the user clicks on search bus button
    Then the bus search results section should be displayed

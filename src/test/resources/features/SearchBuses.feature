Feature: Search for busses functionality
  This feature tests the bus search functionality between the given From and To locations

  @SmokeTest
  Scenario: Successful bus search
    Given user is on the home page
    When user chooses "Bus" from main menu
    Then "Bus Ticket Booking" for Bus page should be loaded
    And FROM, TO, Travel Date, Today, Tomorrow fields should be displayed
    When user opts FROM value as "Hyderabad", "Telangana"
    And user opts TO value as "Vijayawada", "Andhra Pradesh"
    And user selects Travel Date month value as "May 2025" and date value as "31" for the bus
    And user clicks on search bus button
    Then bus search results section should be displayed

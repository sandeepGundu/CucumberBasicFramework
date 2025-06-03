Feature: Search cabs functionality
  This feature tests the cabs search functionality between the given From and To locations

  #@SmokeTest
  Scenario: Successful cabs search
    Given user is on the home page
    When user chooses "Cabs" from main menu
    Then "Book Online Cab" for cabs page should be loaded
    When user selects "Outstation One-way" radio button
    Then From, To, Pickup Date, Pickup Time dropdown should be displayed
    When user selects From value as "HYDERABAD CENTRAL UNIVERSITY"
    And user selects To value as "Sanath Nagar"
    And user selects Pickup Date month value as "May 2025" and date value as "27"
    And user selects Pickup Time value as "10:00 AM"
    And clicks on "search cabs" button
    Then cabs search results should be displayed
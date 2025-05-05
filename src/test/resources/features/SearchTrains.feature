Feature: Search trains for Round-Trip functionality
  This feature tests the trains search functionality between the given From and To locations

  #@SmokeTest
  Scenario: Successful flights search for Round-Trip
    Given the user is on the home page
    When the user chooses "Trains" from main menu
    Then "Train Ticket Booking" for trains page should be loaded
    When the user selects "Book Train tickets" train type radio button
    Then "From", "To", "Departure", "Today", "Tomorrow", "Day After Tomorrow" fields should be displayed
    When the user selects "From" value as "SC", "Secunderabad Junction"
    And the user selects "To" value as "BZA", "Vijayawada Junction"
    And the user selects "Departure" month value as "May 2025" and date value as "14" for the train
    And the user clicks on search trains button
    Then the train search results section should be displayed

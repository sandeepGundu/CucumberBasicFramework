Feature: Search hotels functionality
  This feature tests the hotels search functionality in a given city

  #@SmokeTest
  Scenario: Successful hotels search
    Given user is on the home page
    When user chooses "Hotel" from main menu
    Then "Online Hotel Booking | Book Cheap, Budget and Luxury Hotels -Goibibo" for hotels page should be loaded
    And "Book Hotels and Homestays" for hotels header should be displayed
    Then Where to, Check-in, Check-out, Guests & Rooms dropdown should be displayed in Hotel's page
    When user selects Hotel's "Where to" value as "Chennai"
    And user selects Hotel's Check-in month value as "June 2025" and date value as "25"
    And user selects Hotel's Check-out month value as "June 2025" and date value as "27"
    When user clicks Hotel's Guests & Rooms dropdown
    And user selects Hotel's "Rooms" value as "2"
    And user selects Hotel's "Adults" value as "2"
    And user selects Hotel's "Children" value as "2"
    And user clicks on Hotel's details done button
    And user clicks on search hotels button
    Then Hotel's search results section should be displayed

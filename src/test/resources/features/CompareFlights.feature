Feature: Compare Flights by Key Attributes

  As a user, I want to compare flights by price, duration, and timing so that I can choose the best option.

  Scenario Outline: Display key attributes for selected flights in the comparison view
    Given the user has selected multiple flights for comparison
    When the user navigates to the flight comparison view
    Then the comparison view should display the following attributes side-by-side for all selected flights:
      | Attribute  |
      | Price      |
      | Duration   |
      | Timing     |

  Scenario Outline: Sort the comparison view by key attributes
    Given the user is on the flight comparison view
    When the user selects to sort the flights by <Sorting Attribute>
    Then the comparison view should dynamically update to display flights sorted by <Sorting Attribute>

    Examples:
      | Sorting Attribute |
      | Price             |
      | Duration          |
      | Timing            |

  Scenario: Retain the selected flight for booking
    Given the user has selected a flight in the comparison view
    When the user proceeds to the booking step
    Then the selected flight should remain highlighted and retained for booking

  Scenario: Dynamically update the comparison view on sorting
    Given the user is on the flight comparison view
    When the user changes the sorting attribute to "Price"
    Then the comparison view should dynamically update without reloading the page
    And the flights should be displayed in ascending order of price
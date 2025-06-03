Feature: Verify API functionality

  Scenario: Verify GET request for a specific post
    Given the API endpoint is "https://jsonplaceholder.typicode.com/posts/1"
    When I send a GET request
    Then the response status code should be 200
    And the response body should contain "id" as 1
Feature: Verify API functionality with multiple data sets

  Scenario Outline: Verify GET request for a specific post
    Given the API endpoint is "https://jsonplaceholder.typicode.com/posts/<postId>"
    When I send a GET request
    Then the response status code should be 200
    And the response body should contain "id" as <postId>
    Examples:
    | postId |
    | 1      |
    | 2      |
    | 3      |
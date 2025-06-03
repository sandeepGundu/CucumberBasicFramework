Feature: Verify API functionality to fetch using userId with multiple data sets

  #@RegressionTest
  Scenario Outline: Verify GET request for a specific userId
    Given the API endpoint is "https://jsonplaceholder.typicode.com/posts"
    When I send a GET request with userId value <userIdVal>
    Then the response status code should be 200
    #And the response body should contain "userId" as <userIdVal>
    And the response should contain the following userId value <userIdVal>
    Examples:
    | userIdVal |
    | 1         |
    #| 4         |
    #| 5         |
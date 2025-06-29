Feature: Error handling and Negative Testing

  #@RegressionTest
  Scenario: Verify error response for invalid endpoint
    Given the API endpoint is "https://jsonplaceholder.typicode.com/invalid"
    When I send a GET request
    Then the response status code should be 404
    And the response body should contain "error" as "null"
    #"Not Found"

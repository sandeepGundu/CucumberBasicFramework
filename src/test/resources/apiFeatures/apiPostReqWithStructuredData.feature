Feature: Verify POST request with structured data

  #@RegressionTest
  Scenario: Create a new post
    Given the API endpoint is "https://jsonplaceholder.typicode.com/posts"
    And the request body is:
      | <key>     | <value>          |
      | title   | foo            |
      | body    | bar            |
      | userId  | 1              |
    When I send a POST request
    Then the response status code should be 200
    #And the response body should contain "title" as "foo"
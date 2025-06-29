Feature: To verify Single Column Data Table

  #@RegressionTest
  Scenario: Verify multiple user IDs
    Given the following user IDs:
    | userId |
    | 1      |
    | 2      |
    | 3      |
    When I send a GET request for each user ID
    Then the response status code should be 200
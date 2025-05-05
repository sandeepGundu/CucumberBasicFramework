Feature: Login functionality
  This feature tests the login functionality of the application.

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the dashboard
    Then the user takes a screenshot


  #Scenario Outline: Login with multiple users
    #Given the user is on the login page
    #When the user enters "<username>" and "<password>"
    #Then the user should see the dashboard

    #Examples:
    #| username | password |
    #| user1    | pass1    |
    #| user2    | pass2    |
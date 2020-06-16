Feature: Verify login feature of WebUi

  Scenario: Verify valid login with valid username and valid password
    Given The user is in WebUi login page
    When the user enters a valid username "demo" and valid password "demo"
    And the user click on login button
    Then the user must go to the home page


  Scenario Outline: Verify invalid login with different combination of usernames and passwords
    Given The user is in WebUi login page
    When the user enters an invalid "<Username>" username and "<Password>" password
    And the user click fail login
    Then the user must see the expected error page

    Examples:
    | Username |   Password  |
    | demo1    |   demo      |
    | demo2    |   demo      |

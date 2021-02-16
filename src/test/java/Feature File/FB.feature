Feature: To validate the login page in FB

  Background: 
    Given user has to launch chrome and hit the FB url

  Scenario: To verify login functionality with valid username and invalid password in FB
    When user has to enter the username and password
      | username | password |
      | arul     |    12345 |
      | sirpi    |    12345 |
    And click the login button
    Then user unable to enter the home page

  Scenario: To validate the forget password link
    When user has to click the forget password link
    And user has to enter the mobile number
    And click the search button
    Then user has to navigate OTP page

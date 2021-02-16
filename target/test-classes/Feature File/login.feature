Feature: To validate the login

  Scenario: To validate the login functionality using invalid credentials
    Given User in on catch application Login Page
    When user has to select the mens wear
    And click the polo shirts
    And user has to select white t-shirt
    And user should  select size
    And user has to click add cart button
    Then product added to cart succesfully

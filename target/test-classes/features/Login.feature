@browser
Feature: This feature will be used to create the login functionality of the simplilearn application

  Background: 
    Given I have launched the application
    And I have clicked on the login link

  @WIP
  Scenario: Validate the login success scenario
    When I enter username
    And I enter password
    And I click on login button
    Then I should land on home page

  @sanity
  Scenario: Validate the login failure scenario
    When I enter username
    And I enter password
    And I click on login button
    Then I should get the error message

  @sanity
  Scenario: Validate the Login failure scenario using parameters
    When I enter username as "abc@xyz.com"
    And I enter password as "Abc@1234"
    And I click on login button
    Then I should get the error message as "The email or password you have entered is invalid."

  @Regression @sanity
  Scenario Outline: Validate the login failure scenario using examples
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    And I click on login button
    Then I should get the error message as "<Error>"

    Examples: 
      | UserName    | Password | Error                                              |
      | pqr@xyz.com | Pqr@1234 | The email or password you have entered is invalid. |
      | xyz@abc.com | Xyz@1234 | The email or password you have entered is invalid. |

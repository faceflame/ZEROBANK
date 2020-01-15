@login @smoke
Feature: Login
  Background:
  Given the user is on the login page

  @successful_login
  Scenario: User should successfully login with valid credentials
    When the user enters valid login credentials and clicks signin
    Then the system should display "Zero - Account Summary"

  @unsuccessful_login
  Scenario: User should not be able to login with invalid or blank credentials
    When the user enters wrong username and wrong password, and clicks signin
    Then the error message "Login and/or password are wrong." should be displayed
    And the user enters wrong username but correct password, and clicks signin
    Then the error message "Login and/or password are wrong." should be displayed
    And the user enters correct username but wrong password, and clicks signin
    Then the error message "Login and/or password are wrong." should be displayed
    And the user enters blank username but correct password , and clicks signin
    Then the error message "Login and/or password are wrong." should be displayed
    And the user enters correct username but blank password , and clicks signin
    Then the error message "Login and/or password are wrong." should be displayed
    And the user enters blank username but blank password , and clicks signin
    Then the error message "Login and/or password are wrong." should be displayed


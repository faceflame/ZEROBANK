@pay_bills @smoke
Feature: Pay Bills

  Background:
    Given the user is on Account Summary page
    When the user clicks on Pay Bills tab

  @pay_bills_page_title
  Scenario: User should the page title as "Zero - Pay Bills"
    Then the page title should be "Zero - Pay Bills"

  @succesful_pay_bills
  Scenario: User should be able make a payment
    When the user enters valid information
    And the user clicks on pay button
    Then the system should display the message "The payment was successfully submitted."

  @payment_with_missing_amount_or_date
  Scenario Outline: User should see an alert message if date or amount is missing
    When the user enters missing information for <field>
    And the user clicks on pay button
    Then the system should output the message "Please fill out this field."
    Examples:
      | field  |
      | amount |
      | date   |





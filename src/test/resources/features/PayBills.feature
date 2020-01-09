@pay_bills
Feature: Pay Bills

  Background:
    Given the user is on Account Summary page

  @pay_bills_page_title
  Scenario: User should the page title as "Zero - Pay Bills"
    When the user clicks on Pay Bills tab
    Then the page title should be "Zero - Pay Bills"

    @succesful_pay_bills
    Scenario: User should be able make a payment
      When the user enters valid information
      And the user clicks on pay button
      Then the system should display the message "The payment was successfully submitted."


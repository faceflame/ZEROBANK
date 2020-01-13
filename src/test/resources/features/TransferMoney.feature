@transfer_money
Feature: Transfer Money

  Scenario: User should be able to transfer money successfully
    Given the user is on Account Summary page
    When the user clicks on Transfer Money
    And the user enters valid transfer information and the user clicks on continue
    And the user clicks on submit button
    Then the user should see "You successfully submitted your transaction." message




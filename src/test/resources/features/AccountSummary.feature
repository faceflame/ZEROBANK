@account_summary @smoke
Feature: Account Summary

  Background:
    Given the user is on Account Summary page

  @account_summary_page_title
  Scenario: User should see Account Summary Page title as "Zero - Account Summary"
    Then the system should display the page title as "Zero - Account Summary"

  @account_types
  Scenario: User should see the following account types
    Then the user should be able to see the following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  @credit_card_types
  Scenario: User should see the following Credit Card titles
    Then the user should see the following Credit Card titles
      | Account     |
      | Credit Card |
      | Balance     |





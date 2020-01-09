package com.ZEROBANK.step_definitions;

import com.ZEROBANK.pages.PayBillsPage;
import com.ZEROBANK.utilities.BrowserUtils;
import com.ZEROBANK.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class PayBillsStepDefinitions {
    PayBillsPage payBillsPage = new PayBillsPage();
    Alert alert;
    String actualErrorMessage;

    @When("the user clicks on Pay Bills tab")
    public void the_user_clicks_on_Pay_Bills_tab() {
        payBillsPage.payBillstab.click();
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedPageTitle) {
        Assert.assertEquals(expectedPageTitle, payBillsPage.getPageTitle());
    }

    @When("the user enters valid information")
    public void the_user_enters_valid_information() {
        payBillsPage.makePayment("Bank of America", "Checking", "1500.00", "2020-01-10", "Rent");
    }

    @When("the user clicks on pay button")
    public void the_user_clicks_on_pay_button() {
        payBillsPage.payButton.click();
    }

    @Then("the system should display the message {string}")
    public void the_system_should_display_the_message(String expectedMessage) {
        Assert.assertEquals(expectedMessage, payBillsPage.paymentMessage.getText());
    }

    @When("the user enters missing information for amount")
    public String the_user_enters_missing_information_for_amount() {
        actualErrorMessage=payBillsPage.makePaymentWithMissingAmountOrDate("Sprint", "Checking", "", "2020-01-03", "loan");
        return actualErrorMessage;
    }


    @When("the user enters missing information for date")
    public String the_user_enters_missing_information_for_date() {
        actualErrorMessage=payBillsPage.makePaymentWithMissingAmountOrDate("Sprint", "Checking", "1000", "", "loan");
    return actualErrorMessage;
    }


    @Then("the system should output the message {string}")
    public void the_system_should_output_the_message(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }


}

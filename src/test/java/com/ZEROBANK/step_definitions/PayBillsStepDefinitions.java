package com.ZEROBANK.step_definitions;

import com.ZEROBANK.pages.PayBillsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBillsStepDefinitions {
    PayBillsPage payBillsPage= new PayBillsPage();

    @When("the user clicks on Pay Bills tab")
    public void the_user_clicks_on_Pay_Bills_tab() {
     payBillsPage.payBillstab.click();
    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedPageTitle) {
        Assert.assertEquals(expectedPageTitle, payBillsPage.getPageTitle());
    }
}

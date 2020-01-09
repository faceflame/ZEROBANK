package com.ZEROBANK.step_definitions;

import com.ZEROBANK.pages.AccountSummaryPage;
import com.ZEROBANK.pages.LoginPage;
import com.ZEROBANK.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {
    LoginPage loginPage = new LoginPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("the user is on Account Summary page")
    public void the_user_is_on_Account_Summary_page() {
        loginPage.successfulLogin();

    }

    @Then("the system should display the page title as {string}")
    public void the_system_should_display_the_page_title_as(String expectedPageTitle) {

       // String actualPageTitle= Driver.get().getTitle();
        //Assert.assertEquals(expectedPageTitle, actualPageTitle);

        Assert.assertEquals(expectedPageTitle, accountSummaryPage.getPageTitle());
    }

    @Then("the user should be able to see the following account types")
    public void the_user_should_be_able_to_see_the_following_account_types(List<String> expectedAccountTypes) {
        Assert.assertEquals(expectedAccountTypes, accountSummaryPage.getTableTitles());
    }

    @Then("the user should see the following Credit Card titles")
    public void the_user_should_see_the_following_Credit_Card_titles(List<String>expectedCreditCardTitles) {
                Assert.assertEquals(expectedCreditCardTitles, accountSummaryPage.getCreditCardTitles());
    }


}

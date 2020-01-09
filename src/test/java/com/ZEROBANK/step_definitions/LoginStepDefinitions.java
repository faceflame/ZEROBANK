package com.ZEROBANK.step_definitions;

import com.ZEROBANK.pages.LoginPage;
import com.ZEROBANK.utilities.BrowserUtils;
import com.ZEROBANK.utilities.ConfigurationReader;
import com.ZEROBANK.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @When("the user enters valid login credentials and clicks signin")
    public void the_user_enters_valid_login_credentials_and_clicks_signin() {
        BrowserUtils.waitForClickablility(loginPage.loginButton, 5);
        loginPage.successfulLogin();
    }

    @Then("the system should display {string}")
    public void the_system_should_display(String pageTitle) {
        Assert.assertEquals(pageTitle, Driver.get().getTitle());
    }

    @When("the user enters wrong username and wrong password, and clicks signin")
    public void the_user_enters_wrong_username_and_wrong_password_and_clicks_signin() {
        loginPage.wrongCredentialsLogin();
    }

    @Then("the error message {string} should be displayed")
    public void the_error_message_should_be_displayed(String string) {
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());
        loginPage.usernameBox.clear();
        loginPage.passwordBox.clear();
    }

    @When("the user enters wrong username but correct password, and clicks signin")
    public void the_user_enters_wrong_username_but_correct_password_and_clicks_signin() {
        loginPage.wrongUsernameLogin();
    }

    @When("the user enters correct username but wrong password, and clicks signin")
    public void the_user_enters_correct_username_but_wrong_password_and_clicks_signin() {
        loginPage.wrongPasswordLogin();
    }

    @When("the user enters blank username but correct password , and clicks signin")
    public void the_user_enters_blank_username_but_correct_password_and_clicks_signin() {
        loginPage.blankUsernameLogin();
    }

    @When("the user enters correct username but blank password , and clicks signin")
    public void the_user_enters_correct_username_but_blank_password_and_clicks_signin() {
        loginPage.blankPasswordLogin();
    }

    @When("the user enters blank username but blank password , and clicks signin")
    public void the_user_enters_blank_username_but_blank_password_and_clicks_signin() {
        loginPage.blankLogin();
    }


}
package com.ZEROBANK.pages;

import com.ZEROBANK.utilities.ConfigurationReader;
import com.ZEROBANK.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "user_login")
    public WebElement usernameBox;

    @FindBy (id= "user_password")
    public WebElement passwordBox;

    @FindBy(name = "submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    @FindBy(className = "icon-user")
    public WebElement userButton;


    public void successfulLogin(){
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void wrongPasswordLogin(){
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys("password1");
        loginButton.click();
    }

    public void wrongUsernameLogin(){
        usernameBox.sendKeys("username3");
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void wrongCredentialsLogin(){
        usernameBox.sendKeys("username2");
        passwordBox.sendKeys("password2");
        loginButton.click();
    }

    public void blankUsernameLogin(){
        usernameBox.sendKeys("");
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void blankPasswordLogin(){
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys("");
        loginButton.click();
    }

    public void blankLogin(){
        usernameBox.sendKeys("");
        passwordBox.sendKeys("");
        loginButton.click();
    }







    public LoginPage(){

        PageFactory.initElements(Driver.get(), this);
    }

}

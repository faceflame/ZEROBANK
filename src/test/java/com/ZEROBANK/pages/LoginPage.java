package com.ZEROBANK.pages;

import com.ZEROBANK.utilities.ConfigurationReader;
import com.ZEROBANK.utilities.Driver;
import com.ZEROBANK.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

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



    private WebElement userNameBox = Driver.get().findElement(By.id("user_login"));
    private WebElement pasSwordBox = Driver.get().findElement(By.id("user_password"));
    private WebElement signinButton = Driver.get().findElement(By.name("submit"));


    public void loginMethod() {
        usernameBox.sendKeys("username");
        passwordBox.sendKeys("password");
        signinButton.click();
    }


    @Test
    public void loginTest() {
        loginMethod();
        Assert.assertTrue(Driver.get().getTitle().equals("Zero - Account Summary"));
    }





    public void successfulLogin(){
        String path = "./src/test/resources/test-data/Vytrack_testusers.xlsx";
        String userSheet = "QA3-short";

        ExcelUtil userData = new ExcelUtil(path, userSheet);
        List<Map<String, String>> userList = userData.getDataList();

        userList.get(0).get("username");
        userList.get(0).get("password");

        usernameBox.sendKeys(userList.get(0).get("username"));
        passwordBox.sendKeys(userList.get(0).get("password"));
        //usernameBox.sendKeys(ConfigurationReader.get("username"));
        //passwordBox.sendKeys(ConfigurationReader.get("password"));
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

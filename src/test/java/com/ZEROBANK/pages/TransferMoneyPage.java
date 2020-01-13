package com.ZEROBANK.pages;

import com.ZEROBANK.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferMoneyPage extends BasePage{

    @FindBy(id= "tf_fromAccountId")
    public WebElement fromAccountDropdown;

    @FindBy(id = "tf_toAccountId")
    public WebElement toAccountDropDown;

    @FindBy(id = "tf_amount")
    public WebElement amountBox;

    @FindBy(id = "tf_description")
    public WebElement descriptionBox;

    @FindBy(id = "btn_submit")
    public WebElement continueButton;

    @FindBy(id = "btn_submit")
    public WebElement submitButton;

    @FindBy(xpath = "//div[contains (text(), 'you' )] ")
    public WebElement transferMessage;


public void TransferMoney (){
    Select select= new Select(fromAccountDropdown);
    Select select1= new Select(toAccountDropDown);
    select.selectByValue("1");
    select1.selectByValue("2");
    amountBox.sendKeys("1500");
    descriptionBox.sendKeys("Rent payment");
    continueButton.click();
}



    public TransferMoneyPage(){
        PageFactory.initElements(Driver.get(), this);

    }
}

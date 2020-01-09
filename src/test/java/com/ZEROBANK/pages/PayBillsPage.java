package com.ZEROBANK.pages;

import com.ZEROBANK.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

public class PayBillsPage extends BasePage {

    @FindBy(id = "sp_payee")
    public WebElement payeeDropdown;

    @FindBy(id = "sp_account")
    public WebElement accountDropdown;

    @FindBy(id = "sp_amount")
    public WebElement amountBox;

    @FindBy(id = "sp_date")
    public WebElement dateBox;

    @FindBy(id = "sp_description")
    public WebElement descriptionBox;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

    @FindBy(xpath = "//div[@id='alert_content']/span")
    public WebElement paymentMessage;


    public String getPageTitle() {
        String actualPageTitle = Driver.get().getTitle();
        return actualPageTitle;
    }

    public void makePayment(String payee, String accountType, String amount, String date_YYYY_MM_DD, String description) {
        Select select = new Select(payeeDropdown);
        select.selectByVisibleText(payee);
        Select select1 = new Select(accountDropdown);
        select1.selectByVisibleText(accountType);
        amountBox.sendKeys(amount);
        dateBox.sendKeys(date_YYYY_MM_DD);
        descriptionBox.sendKeys(description);
    }

    public String makePaymentWithMissingAmountOrDate(String payee, String accountType, String amount, String date_YYYY_MM_DD, String description) {
        Select select = new Select(payeeDropdown);
        select.selectByVisibleText(payee);
        Select select1 = new Select(accountDropdown);
        select1.selectByVisibleText(accountType);
        amountBox.sendKeys(amount);
        dateBox.sendKeys(date_YYYY_MM_DD);
        descriptionBox.sendKeys(description);

        String actualErrorMessage = "";

        if (amount.isEmpty()) {
            actualErrorMessage = Driver.get().findElement(By.id("sp_amount")).getAttribute("validationMessage");
        } else if (date_YYYY_MM_DD.isEmpty()) {
            actualErrorMessage = Driver.get().findElement(By.id("sp_date")).getAttribute("validationMessage");
        }
        return actualErrorMessage;
    }


    public PayBillsPage() {
        PageFactory.initElements(Driver.get(), this);

    }
}

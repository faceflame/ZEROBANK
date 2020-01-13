package com.ZEROBANK.pages;

import com.ZEROBANK.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends BasePage{

    @FindBy(css= "[class=\'board-header\']")
    public List<WebElement>TableTitles;

    @FindBy(xpath = "(//div[@class='board-content']/table/thead)[3]/tr/th")
    public List<WebElement>creditAccountTitles;

    @FindBy(xpath = "//a[contains(text(), 'Brokerage')]")
    public WebElement brokerageLink;

    @FindBy(xpath = "//a[contains(text(), 'Savings')]")
    public WebElement savingsLink;

    @FindBy(xpath = "//a[contains(text(), 'Checking')]")
    public WebElement checkingAccountLink;

    @FindBy(xpath = "//a[contains(text(), 'Credit')]")
    public WebElement creditCardLink;

    @FindBy(xpath = "//a[contains(text(), 'Loan')]")
    public WebElement LoanLink;


    public String getPageTitle(){
        String actualPageTitle=Driver.get().getTitle();
        return actualPageTitle;
    }

    public List<String> getTableTitles(){
        List<String> tableTitles=new ArrayList<>();

        for (int i = 0; i <TableTitles.size() ; i++) {
            tableTitles.add(TableTitles.get(i).getText());
        }

        return tableTitles;
    }


    public List<String> getCreditCardTitles (){

        List<String>actualCreditCardTitles= new ArrayList<>();

        for (int i = 0; i <creditAccountTitles.size() ; i++) {
            actualCreditCardTitles.add(creditAccountTitles.get(i).getText());
        }
        return actualCreditCardTitles;

    }

    public AccountSummaryPage(){
        PageFactory.initElements(Driver.get(), this);

    }
}

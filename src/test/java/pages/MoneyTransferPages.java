package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class MoneyTransferPages {
    public MoneyTransferPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText="Transfer Funds")
    public WebElement transferButton;

    @FindBy(id="tf_fromAccountId")
    public WebElement fromAccountMenu;

    @FindBy(id="tf_toAccountId")
    public WebElement toAccountMenu;

    @FindBy(id="tf_amount")
    public WebElement amountBox;

    @FindBy(id="tf_description")
    public WebElement descriptionBox;

    @FindBy(id="btn_submit")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement message;


    public void method01 (){
        Select select = new Select(fromAccountMenu);
        select.selectByVisibleText("Savings(Avail. balance = $ 1000)");
    }



}

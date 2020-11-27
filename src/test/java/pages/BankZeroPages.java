package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BankZeroPages {

    public BankZeroPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "signin_button")
    public WebElement singinButton;

    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement singin;

    @FindBy(linkText= "Pay Bills")
    public WebElement payBills;

    @FindBy(linkText = "Add New Payee")
    public WebElement addNewPayee;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id="np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(id="np_new_payee_account")
    public WebElement payeeAccount;

    @FindBy(id="np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(id="add_new_payee")
    public  WebElement addButton;

    @FindBy(id="alert_content")
    public WebElement alertMessage;





}


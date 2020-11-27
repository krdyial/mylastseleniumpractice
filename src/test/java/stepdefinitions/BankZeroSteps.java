package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.BankZeroPages;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class BankZeroSteps {
    BankZeroPages bankZeroPages =new BankZeroPages();

    @Given("user goes to mainpage")
    public void user_goes_to_mainpage() {
        Driver.getDriver().get(ConfigReader.getProperty("bank_url"));
    }
    @Given("clicks sign in")
    public void clicks_sign_in() {
        bankZeroPages.singinButton.click();
    }

    @Given("username")
    public void username() {
        bankZeroPages.username.sendKeys(ConfigReader.getProperty("bank_user"));
    }

    @Given("password")
    public void password() throws InterruptedException {
        bankZeroPages.password.sendKeys(ConfigReader.getProperty("bank_pass"));
        Thread.sleep(3000);
    }

    @Then("clicks login button")
    public void clicks_login_button() throws InterruptedException {
        bankZeroPages.singin.click();
        Thread.sleep(3000);
    }


    @Then("user clicks pay bills")
    public void user_clicks_pay_bills() {
        bankZeroPages.payBills.click();
    }

    @Then("clicks Add new payee")
    public void clicks_Add_new_payee() throws InterruptedException {
        bankZeroPages.addNewPayee.click();
        Thread.sleep(2000);
    }

    @Then("Enters payee name")
    public void enters_payee_name() throws InterruptedException {
        bankZeroPages.payeeName.sendKeys("Strom Rechnung");
        Thread.sleep(2000);
    }

    @Then("enters payee address")
    public void enters_payee_address() throws InterruptedException {
        bankZeroPages.payeeAddress.sendKeys("Deutschland");
        Thread.sleep(2000);
    }

    @Then("enters account")
    public void enters_account() throws InterruptedException {
        bankZeroPages.payeeAccount.sendKeys("Deutsche Bank");
        Thread.sleep(2000);
    }

    @Then("enters payee details")
    public void enters_payee_details() throws InterruptedException{
        bankZeroPages.payeeDetails.sendKeys("per Month");
        Thread.sleep(2000);
    }

    @Then("clicks login")
    public void clicks_login() throws InterruptedException{
        bankZeroPages.addButton.click();
        Thread.sleep(2000);
    }
    @Then("Assert alert text")
    public void assert_alert_text() {
        System.out.println(bankZeroPages.alertMessage.getText());
        Assert.assertTrue(bankZeroPages.alertMessage.getText().contains("successfully"));
    }


}

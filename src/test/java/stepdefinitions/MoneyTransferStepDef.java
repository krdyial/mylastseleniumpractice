package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.MoneyTransferPages;

import java.lang.reflect.Modifier;

public class MoneyTransferStepDef {
        MoneyTransferPages moneyTransferPages= new MoneyTransferPages();
    @Then("clicks transfer funds")
    public void clicks_transfer_funds() {
        moneyTransferPages.transferButton.click();
    }

    @Then("selects savings from account drag drop")
    public void selects_savings_from_account_drag_drop() {
        moneyTransferPages.method01();
    }

    @Then("selects brokers from to account drag drop")
    public void selects_brokers_from_to_account_drag_drop() {
        Select select = new Select(moneyTransferPages.toAccountMenu) ;
        select.selectByVisibleText("Brokerage(Avail. balance = $ 197)");

    }

    @Then("enters amount")
    public void enters_amount() {
        moneyTransferPages.amountBox.sendKeys("10000");
    }

    @Then("enters descriptions")
    public void enters_descriptions() throws InterruptedException {
        moneyTransferPages.descriptionBox.sendKeys("This sending is very important for our company");
        Thread.sleep(2000);
    }

    @Then("clicks continue")
    public void clicks_continue() {
        moneyTransferPages.continueButton.click();
    }

    @Then("clicks submit")
    public void clicks_submit() {
        moneyTransferPages.submitButton.click();
    }

    @Then("verifies the message text {string}")
    public void verifies_the_message_text(String string) {
        String actual = moneyTransferPages.message.getText();
        System.out.println(actual);
        Assert.assertEquals(string, actual );
    }
}

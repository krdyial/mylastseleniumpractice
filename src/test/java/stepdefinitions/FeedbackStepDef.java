package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FeedbackPages;

public class FeedbackStepDef {
    FeedbackPages pages = new FeedbackPages();

    @Then("user clicks bankzero")
    public void user_clicks_bankzero() {
        pages.zerobankButton.click();
    }

    @Then("user clicks feedbacks")
    public void user_clicks_feedbacks() {
        pages.feedbackButton.click();
    }

    @Then("user enters name {string}")
    public void user_enters_name(String string) {
        pages.nameBox.sendKeys(string);
    }

    @Then("user enters mail address {string}")
    public void user_enters_mail_address(String string) throws InterruptedException {
        pages.emailBox.sendKeys(string);
        Thread.sleep(2000);
    }

    @Then("user enters subject {string}")
    public void user_enters_subject(String string) throws InterruptedException {
        pages.subjectBox.sendKeys(string);
        Thread.sleep(2000);
    }

    @Then("users enters questions {string}")
    public void users_enters_questions(String string) throws InterruptedException {
        pages.commentBox.sendKeys(string);
        Thread.sleep(2000);
    }

    @Then("user clicks send message")
    public void user_clicks_send_message() {
        pages.submitButton.click();
    }

    @Then("user verifies the message contains {string}")
    public void user_verifies_the_message_contains(String string) {
        String actual = pages.messageText.getText();
        System.out.println(actual);

    }
}
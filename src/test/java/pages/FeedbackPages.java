package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FeedbackPages {
    public FeedbackPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Zero Bank")
    public WebElement zerobankButton;

    @FindBy(id="feedback")
    public WebElement feedbackButton;

    @FindBy(id="name")
    public WebElement nameBox;

    @FindBy(id="email")
    public WebElement emailBox;

    @FindBy(id="subject")
    public WebElement subjectBox;

    @FindBy(id="comment")
    public WebElement commentBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='page-header']")
    public WebElement messageText;



public void get01(){
    String str= "Ali";

}
}
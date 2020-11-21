package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SwagLabs {

// Önce constructor ac ve icerisine pagefactory gir

    public  SwagLabs(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//button[@class='btn_primary btn_inventory'])[1]")
    public WebElement firstElementAdd;

    @FindBy(xpath = "//a[@class='shopping_cart_link fa-layers fa-fw']")
    public WebElement cartButton;

    @FindBy(linkText = "Sauce Labs Backpack")
    public WebElement materialName;

}

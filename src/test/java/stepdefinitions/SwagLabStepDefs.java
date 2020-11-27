package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SwagLabs;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class SwagLabStepDefs {
    SwagLabs swagLabs = new SwagLabs();




    @Given("user on the homepage")
    public void user_on_the_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("swag_url"));

    }

    @When("user enters username")
    public void user_enters_username() {
        swagLabs.usernameBox.sendKeys(ConfigReader.getProperty("user_name"));
    }

    @When("user enters password")
    public void user_enters_password() {
        swagLabs.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("user clicks login")
    public void user_clicks_login() {
        swagLabs.loginButton.click();


    }

    @When("user adds first material to the cart")
    public void user_adds_first_material_to_the_cart() {
        swagLabs.firstElementAdd.click();
    }

    @When("user clicks cart")
    public void user_clicks_cart() {
        swagLabs.cartButton.click();
    }

    @Then("user verifies the name of the material")
    public void user_verifies_the_name_of_the_material() {
        String materialName = swagLabs.materialName.getText();
        System.out.println(materialName);
        Assert.assertEquals("Sauce Labs Backpack", materialName);
    }


}

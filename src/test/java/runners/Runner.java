package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        //Path of the feature folder
        plugin ={
                "html:target\\default-cucumber-reports",
                "json:target\\json-reports\\cucumber.json",
                "junit:target\\xml-report\\cucumber.xml"
        },
        features = "src\\test\\resources\\features",
        //Path of the step definition folder

        glue="database_stepdefinition",
        //tags = "@bank",
        //tags= "@bank2",
        tags="bank3",
        dryRun = false
)
public class Runner {
//Runner class is to Run the feature files==like @Test or main method
//This runner class is also used to configure and control the framework


}




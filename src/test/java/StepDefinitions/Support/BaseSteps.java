package StepDefinitions.Support;


import Selenium.CoreDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Stories", glue = {"StepDefinitions.Support", "StepDefinitions.WikiSteps"})
public class BaseSteps extends CoreDriver {



}


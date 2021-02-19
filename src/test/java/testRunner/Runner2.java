package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeaturesFiles"},tags= {"@logindatatable"},monochrome=true,glue= {"stepDefinations"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/login.html","pretty",
"html:target/cucumber-Login"})
public class Runner2 {
	
}

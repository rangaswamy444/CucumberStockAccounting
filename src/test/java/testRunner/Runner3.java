package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeaturesFiles"},monochrome=true,tags={"@Supplierdata"},glue={"stepDefinations"}
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Supplier.html","pretty",
"html:target/cucumber-supplier"})
public class Runner3 extends AbstractTestNGCucumberTests{

}

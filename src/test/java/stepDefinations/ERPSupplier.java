package stepDefinations;
import org.openqa.selenium.WebDriver;

import FunctionLibrary.CommonFunctions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class ERPSupplier {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	   driver= CommonFunctions.startBrowser();
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	   CommonFunctions.openApplication(driver);
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
	   CommonFunctions.waitForElement(driver, "id", "username", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	    CommonFunctions.typeAction(driver, "id", "username", "admin");
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
	    CommonFunctions.waitForElement(driver, "name", "password", "10");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	    CommonFunctions.typeAction(driver, "name", "password", "master");
	}

	@When("^Wait For Login$")
	public void wait_For_Login() throws Throwable {
	    CommonFunctions.waitForElement(driver, "id", "btnsubmit", "10");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	    CommonFunctions.clickAction(driver, "id", "btnsubmit");
	}

	@When("^Wait For Supplier$")
	public void wait_For_Supplier() throws Throwable {
	    CommonFunctions.waitForElement(driver, "xpath", "//body/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]", "10");
	}

	@When("^Click On Supplier$")
	public void click_On_Supplier() throws Throwable {
	   CommonFunctions.clickAction(driver, "xpath", "//body/div[2]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]");
	}

	@When("^Wait For AddButton$")
	public void wait_For_AddButton() throws Throwable {
	    CommonFunctions.waitForElement(driver, "xpath", "/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]", "10");
	}

	@When("^Click On AddButton$")
	public void click_On_AddButton() throws Throwable {
	    CommonFunctions.clickAction(driver, "xpath", "/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]");
	}

	@When("^Wait For SupplierNumber$")
	public void wait_For_SupplierNumber() throws Throwable {
	    CommonFunctions.waitForElement(driver, "name", "x_Supplier_Number", "10");
	}

	@Then("^Capture Data$")
	public void capture_Data() throws Throwable {
	    CommonFunctions.captureData(driver, "name", "x_Supplier_Number");
	}

	@When("^Wait For SupplierName$")
	public void wait_For_SupplierName() throws Throwable {
	    CommonFunctions.waitForElement(driver, "name", "x_Supplier_Name", "10");
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String testdata, String locatortype, String locatorvalue) throws Throwable {
	    CommonFunctions.typeAction(driver, locatortype, locatorvalue, testdata);
	}

	@When("^Wait For Add Button$")
	public void wait_For_Add_Button() throws Throwable {
	    CommonFunctions.waitForElement(driver, "id", "btnAction", "10");
	}

	@When("^Click On Add Button after adding notes$")
	public void click_On_Add_Button_after_adding_notes() throws Throwable {
	   CommonFunctions.clickAction(driver, "id", "btnAction");
	}

	@When("^Wait For Ok Button$")
	public void wait_For_Ok_Button() throws Throwable {
	    CommonFunctions.waitForElement(driver, "xpath", "(//button[text()='OK!'])[1]", "10");
	}

	@When("^Click On Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Ok_Button_with_and(String locatortype, String locatorvalue) throws Throwable {
	    CommonFunctions.clickAction(driver, locatortype,locatorvalue);
	}

	@When("^Wait For Alert$")
	public void wait_For_Alert() throws Throwable {
	    CommonFunctions.waitForElement(driver, "xpath", "(//button[text()='OK'])[6]", "10");
	}

	@When("^Click On Alert$")
	public void click_On_Alert() throws Throwable {
	    CommonFunctions.clickAction(driver, "xpath", "(//button[text()='OK'])[6]");
	}

	@Then("^user validate the supplier table$")
	public void user_validate_the_supplier_table() throws Throwable {
	    CommonFunctions.tableValidation(driver, "6");
	}

	@When("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	   driver.close();
	}

}

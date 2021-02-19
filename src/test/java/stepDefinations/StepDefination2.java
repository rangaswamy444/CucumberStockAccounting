package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination2 {
	WebDriver driver;
	String url="http://projects.qedgetech.com/webapp/login.php";
	@Given("^user launch \"([^\"]*)\" in multiple$")
	public void user_launch_in_multiple(String brw)throws Throwable {
		if(brw.equalsIgnoreCase("chrome"))
		{
			System.out.println("Executing on Chrome");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		else if(brw.equalsIgnoreCase("firefox"))
		{

			System.out.println("Executing on Firefox");
			driver = new FirefoxDriver();
			driver.get(url);
			Thread.sleep(5000);
		}
		 else
		    {
		    	System.out.println("Browser value is not matching");
		    }
	   
	}

	@When("^user Click on reset button$")
	public void user_Click_on_reset_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='btnreset']")).click();
		 Thread.sleep(5000);
	}


	@When("^user enter \"([^\"]*)\" in userfield$")
	public void user_enter_in_userfield(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}

	@When("^user enter \"([^\"]*)\" in passwordfield$")
	public void user_enter_in_passwordfield(String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		Thread.sleep(5000);
	}

	@Then("^user validate title$")
	public void user_validate_title() throws Throwable {
		String expectedtitle = "Dashboard « Stock Accounting";
		  String actualtitle = driver.getTitle();
		  if(actualtitle.equalsIgnoreCase(expectedtitle))
		  {
			  System.out.println("Login Success::"+expectedtitle+"   "+actualtitle);
		  }
		  else
		  {
			  System.out.println("Login Fail::"+expectedtitle+"   "+actualtitle);
		  }
	}

	@Then("^user close Browser$")
	public void user_close_Browser() throws Throwable {
	   driver.quit();
	}
}

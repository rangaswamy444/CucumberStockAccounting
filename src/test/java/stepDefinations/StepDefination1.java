package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 {
	WebDriver driver;
	@Given("^i launch url in browser$")
	public void i_launch_url_in_browser() throws Throwable {
	    driver = new ChromeDriver();
	    driver.get("http://projects.qedgetech.com/webapp/login.php");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	}

	@When("^i click on reset button$")
	public void i_click_on_reset_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='btnreset']")).click();
		 Thread.sleep(5000);
	}

	@When("^i enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("master");
	}

	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='btnsubmit']")).click();
		Thread.sleep(5000);
	}

	@Then("^i validate title$")
	public void i_validate_title() throws Throwable {
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

	@Then("^i close browser$")
	public void i_close_browser() throws Throwable {
		driver.close();
	  
	}


}

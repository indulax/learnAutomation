package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver;
	@Given("^user is in OrangeHRM login page$")
	public void user_is_in_OrangeHRM_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^hompage should be displayed$")
	public void hompage_should_be_displayed() throws Throwable {
		boolean pageLoaded = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue("Login successfull", pageLoaded);
	}

}

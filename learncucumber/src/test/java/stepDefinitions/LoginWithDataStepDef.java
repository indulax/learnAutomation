package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithDataStepDef {
	WebDriver driver;
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user enters valid credential \"(.*?)\" and \"([^\"]*)\"$")
	public void user_enters_valid_credential_and(String username, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}
	

	@Then("^welcome page should be shown$")
	public void welcome_page_should_be_shown() throws Throwable {
		boolean pageLoaded = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		if(pageLoaded)
			System.out.println("Login success");
	}

}

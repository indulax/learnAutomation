package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableWithEamplesStepDef {
	WebDriver driver;

	@Given("^endduser entered into login page$")
	public void endduser_entered_into_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("^enters below credentials \"(.*?)\" and \"(.*?)\"$")
	public void enters_below_credentials_and(String userName, String password) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^clicking on login button$")
	public void clicking_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}
}
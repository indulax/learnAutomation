package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableNoHeaderStepDef {
	WebDriver driver;

	@Given("^user is entered into login page$")
	public void user_is_entered_into_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^valid credentials are entered$")
	public void valid_credentials_are_entered(DataTable dataTable) throws Throwable {
		List<String> credentials = dataTable.asList(String.class);
		driver.findElement(By.id("txtUsername")).sendKeys(credentials.get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(credentials.get(1));
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome page should be displayed$")
	public void welcome_page_should_be_displayed() throws Throwable {
		boolean pageLoaded = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		if (pageLoaded)
			System.out.println("Login success");
		driver.quit();
	}

}

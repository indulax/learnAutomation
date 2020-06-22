package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeaderStepDef {
	WebDriver driver;

	@Given("^Goto login page$")
	public void goto_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^enter valid credentials$")
	public void enter_valid_credentials(DataTable dataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String, String>> keyValuePair = dataTable.asMaps(String.class, String.class);
		String userName = keyValuePair.get(0).get("Username");
		String password = keyValuePair.get(0).get("Password");
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome page need to be displayed$")
	public void welcome_page_need_to_be_displayed() throws Throwable {
		boolean pageLoaded = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		if (pageLoaded)
			System.out.println("Login success");
		driver.quit();
		System.out.println("Inside Data table with header class");
	}
}

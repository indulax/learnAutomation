package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinition {
	WebDriver driver;

	@Given("^User launches Google\\.co\\.in$")
	public void user_launches_Google_co_in() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");

	}

	@When("^User enters search term as \"([^\"]*)\"$")
	public void user_enters_search_term_as(String searchTerm) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	}

	@When("^Press on Enter key$")
	public void press_on_Enter_key() throws Throwable {
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^The user should see search results$")
	public void the_user_should_see_search_results() throws Throwable {
		boolean status = driver.findElement(By.partialLinkText("school")).isDisplayed();
		if (status) {
			System.out.println("Search result displayed");
		}

	}

}

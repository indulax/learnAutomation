package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {
	public static void main(String args[]) {
		//Open Firefox
		// Goto Google
		//Close Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
		
	}

}

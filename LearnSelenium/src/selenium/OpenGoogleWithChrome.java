package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleWithChrome {
	
	public static void main(String args[]) {
		
		//Open chrome
		// Goto Google.co.in
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		//Search for a term
		driver.findElement(By.name("q")).sendKeys("Agni"+ Keys.ENTER);
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonOperations {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Softwares\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");

		// Get X and Y coordinates of Get Position button
		WebElement getPositionButton = driver.findElement(By.id("position"));
		Point xyvalue = getPositionButton.getLocation();
		int xValue = xyvalue.getX();
		int yValue = xyvalue.getY();
		System.out.println("X value of Get Position button " + xValue + " Y value " + yValue);

		// Get background color What color am I button
		WebElement getColorButton = driver.findElement(By.id("color"));
		String backGroundColor = getColorButton.getCssValue("background-color");
		System.out.println(backGroundColor);

		// Find size of button
		WebElement getButtonSize = driver.findElement(By.id("size"));
		Dimension buttonSize = getButtonSize.getSize();
		System.out.println(buttonSize);
		int buttonHeight = buttonSize.getHeight();
		int buttonWidth = buttonSize.getWidth();
		System.out.println(buttonHeight + " " + buttonWidth);

		// Click button
		WebElement gotoHomeButton = driver.findElement(By.id("home"));
		gotoHomeButton.click();
	}

}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//Select dropdown option by index
		WebElement chooseByIndex = driver.findElement(By.id("dropdown1"));
		Select selectByIndex = new Select(chooseByIndex);
		selectByIndex.selectByIndex(1);
		
		//Select drop down by text
		WebElement chooseByText = driver.findElement(By.name("dropdown2"));
		Select selectByText = new Select(chooseByText);
		selectByText.selectByVisibleText("Appium");
		
		//Select dropdown by value
		WebElement chooseByValue = driver.findElement(By.id("dropdown3"));
		Select selectByValue = new Select(chooseByValue);
		selectByValue.selectByValue("3");
		
		//Get no.of drop down options
		WebElement noOfOptions = driver.findElement(By.className("dropdown"));
		Select optionCount = new Select(noOfOptions);
		List<WebElement> listSize = optionCount.getOptions();
		System.out.println(listSize.size());
		
		//Select dropdown by sendkeys
		WebElement chooseBySendKey = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		chooseBySendKey.sendKeys("Appium");
		
		//Choose multiple drop down options
		WebElement multiSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiSelectOption = new Select(multiSelect);
		multiSelectOption.selectByIndex(1);
		multiSelectOption.selectByIndex(3);
		
		
		
	}

}

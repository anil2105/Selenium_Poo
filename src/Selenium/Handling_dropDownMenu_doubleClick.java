package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_dropDownMenu_doubleClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
	
		WebElement doubleClick = driver.findElement(By.id("email"));
		
		Actions action=new Actions(driver);
		
		//how to double click -->doubleClick()
		action.moveToElement(doubleClick).sendKeys("Anil").doubleClick().perform();
		
		Thread.sleep(3000);
		driver.close();
	
	}
}

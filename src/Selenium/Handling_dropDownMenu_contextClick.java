package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_dropDownMenu_contextClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\Program files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://localhost/login.do");
	
		WebElement rightClick = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
		
		Actions action=new Actions(driver);
		
		//how to right click -->contextClick()
		action.moveToElement(rightClick).contextClick().perform();
		
		Thread.sleep(2000);
		action.sendKeys("q").perform(); //to click on Inspect element,we should pass the underlined letter i.e., "q"
		
		Thread.sleep(3000);
		driver.close();
	
	}
}

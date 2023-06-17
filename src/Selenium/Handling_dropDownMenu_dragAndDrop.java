package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_dropDownMenu_dragAndDrop
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	
		WebElement dragFrom = driver.findElement(By.xpath("//h1[.='Block 1']"));
		
		WebElement dragTo = driver.findElement(By.xpath("//h1[.='Block 4']"));
		
		
		Actions action=new Actions(driver);
		
		//how to drag and drop -->dragAndDrop()
		action.dragAndDrop(dragFrom, dragTo).perform();
		
		Thread.sleep(3000);
		driver.close();
	
	}
}

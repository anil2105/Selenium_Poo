package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_dropDownMenu_moveToElement
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.actimind.com/");
	
		WebElement moveToElement = driver.findElement(By.xpath("//a[contains(text(), 'EXPERTISE')]"));
		
		//Actions class
		Actions action=new Actions(driver);
		
		//how to move to element --> moveToElement()
		action.moveToElement(moveToElement).perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Cloud Applications'])[1]")).click();
		
		Thread.sleep(3000);
		driver.close();
	
	}
}

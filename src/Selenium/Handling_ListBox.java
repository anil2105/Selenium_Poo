package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_ListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/r.php");
		
		Thread.sleep(2000);
		WebElement listBox = driver.findElement(By.id("month"));
		
		//handling month list --> using Select class
		Select select=new Select(listBox);
		
		//we have 3 methods in Select class
		
		Thread.sleep(2000);
		//1st method -- select by index
		select.selectByIndex(5); //June
		
		Thread.sleep(2000);
		//2nd method -- select by value --> recommended in real time 
		select.selectByValue("11"); //Nov
		
		Thread.sleep(2000);
		//3rd method -- select by visibleText
		select.selectByVisibleText("Jul"); //July
		
	//	select.deselectAll(); //UnsupportedOperationException
		
		if (select.isMultiple())
		{
			Thread.sleep(2000);
			select.deselectAll(); //UnsupportedOperationException
		}
		else 
		{
			System.out.println("False: It is not a Multi List Box");
		}
		
		
		Thread.sleep(3000);
		driver.close();
	}
}

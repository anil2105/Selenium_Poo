package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_MultiListBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation9.html");
		
		Thread.sleep(2000);
		WebElement listBox = driver.findElement(By.id("book"));
		
		//using Select class
		Select select=new Select(listBox);
		
		//we have 3 methods in Select class
		
		
		Thread.sleep(2000);
		//1st method -- select by index
		select.selectByIndex(3); //Ruby
		
		Thread.sleep(2000);
		//2nd method -- select by value --> recommended in real time 
		select.selectByValue("j"); //Java
		
		Thread.sleep(2000);
		//3rd method -- select by visibleText
		select.selectByVisibleText("C++"); //C++
		
		if (select.isMultiple())
		{
			Thread.sleep(2000);
			//select.deselectAll(); 
			
			Thread.sleep(2000);
			select.deselectByIndex(3); //Ruby
			
			Thread.sleep(2000);
			select.deselectByValue("j"); //Java
			
			Thread.sleep(2000);
			select.deselectByVisibleText("C++"); //C++
			
			Thread.sleep(2000);
			System.out.println("True: It is Multi List Box");
		}
		else 
		{
			System.out.println("False: It is not a Multi List Box");
		}
		
		
		Thread.sleep(3000);
		driver.close();
	}
}

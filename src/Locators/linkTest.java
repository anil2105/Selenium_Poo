package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Program files//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation1.html");
		driver.findElement(By.linkText("actitime")).click();
		
		Thread.sleep(2000);
		driver.close();
	
	}
}

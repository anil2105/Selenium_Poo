package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation6.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//sendKeys
	//	js.executeScript("document.getElementById('un').value='Selenium1'");
		
		//clear 
		js.executeScript("document.getElementById('un').value=''"); 
		
		Thread.sleep(3000);
		driver.close();
	}
}

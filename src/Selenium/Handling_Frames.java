package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation11.html");
		
		//handling iframe
		
		WebElement frames = driver.findElement(By.id("f1"));
		
		driver.switchTo().frame(frames);
		
	
		driver.findElement(By.id("t3")).sendKeys("Ani"); //sending value to FN
		
		driver.findElement(By.id("c1")).click(); //clicking C1
		
		driver.findElement(By.id("c2")).click(); //clicking C
		
		
		//going to main page
		
		driver.switchTo().defaultContent();
	//	driver.switchTo().parentFrame();
		

		driver.findElement(By.id("t1")).sendKeys("Anil"); //sending value to UN
		
		driver.findElement(By.id("t2")).sendKeys("123456789"); //sending value to PW
		
		
		Thread.sleep(3000);
		driver.close();
	}
}

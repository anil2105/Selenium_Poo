package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLogin_practice
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("anil.krtg@yahoo.com");
		//driver.findElement(By.name("email")).sendKeys("anil.krtg@yahoo.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anil.krtg@yahoo.com");
		
		Thread.sleep(2000);
		driver.close();
	}
}

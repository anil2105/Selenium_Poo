package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogIn 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\Program files\\geckodriver-v0.30.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("anil.krtg@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("ani94488");
		driver.findElement(By.name("login")).click();
		
		driver.close();
	}
}

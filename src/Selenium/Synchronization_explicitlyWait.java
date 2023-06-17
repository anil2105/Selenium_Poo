package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_explicitlyWait
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		
		String loginPageTitle = driver.getTitle();
		System.out.println("Login page title: "+loginPageTitle);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		
		wait.until(ExpectedConditions.titleContains("Time")); //or Time or Track
		
		
		String homePageTitle = driver.getTitle();
		System.out.println("Home page title: "+homePageTitle);
		
		
		Thread.sleep(3000);
		driver.close();
		
	}
}

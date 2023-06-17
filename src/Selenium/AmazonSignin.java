package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSignin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.name("email")).sendKeys("anil.krtg@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("ani@9448813816"); 
		driver.findElement(By.id("signInSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println("Title of the page= "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of the page= "+currentUrl);
		
		driver.close();
	}
}

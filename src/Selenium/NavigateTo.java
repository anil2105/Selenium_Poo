package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Program files//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000); 
		driver.navigate().to("https://www.facebook.com/");
	
		Thread.sleep(5000); 
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		Thread.sleep(5000); 
		driver.navigate().refresh();
		
		Thread.sleep(5000); 
		driver.close();
	}
}

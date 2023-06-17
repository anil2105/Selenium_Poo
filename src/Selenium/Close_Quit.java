package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Program files//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//Enter the URL
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(20000);
		//closes the current window 
		driver.close();
		
		Thread.sleep(5000);
		//closes the entire window
		driver.quit(); 
	}
}

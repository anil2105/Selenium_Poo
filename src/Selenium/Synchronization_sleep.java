package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_sleep
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.findElement(By.xpath("//a[.='CLICK ME!']")).click();
		
		Thread.sleep(10000); //using Thread.sleep()
		driver.findElement(By.xpath("//p[.='CLICK ME!']")).click();
		
		
	
		Thread.sleep(3000);
		driver.close();
		
	}
}

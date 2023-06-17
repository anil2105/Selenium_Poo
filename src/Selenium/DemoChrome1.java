package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Program files//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        
		Thread.sleep(3000);
        driver.get("https://www.facebook.com/");
        Dimension d1=new Dimension(200, 300);
        driver.manage().window().setSize(d1);
        
        Thread.sleep(3000);
        Point p1=new Point(100, 10);
        driver.manage().window().setPosition(p1);	
        
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        driver.close();
	}
}

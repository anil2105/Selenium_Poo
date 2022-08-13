package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Program files//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//Enter the url
		driver.get("https://in.tradingview.com/");
		
		Thread.sleep(5000);
		//width & height
		Dimension d1=new Dimension(200, 500);
		driver.manage().window().setSize(d1); //setSize method is going to set the width & height
	
		Thread.sleep(5000);
		//X & Y
		Point p1=new Point(50, 200);
		driver.manage().window().setPosition(p1); //setPosition method is going to set the X & Y
		
		Thread.sleep(5000);
		//Maximize
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		//Close the browser
		driver.close();
	
	}
	
}

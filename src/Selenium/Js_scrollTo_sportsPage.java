package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_scrollTo_sportsPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://news.google.com/");
		
		Thread.sleep(3000);
		WebElement sportsPage = driver.findElement(By.xpath("(//span[.='Sports'])[1]"));
			
		int y = sportsPage.getLocation().getY();

		System.out.println(y);
		 
		JavascriptExecutor js=(JavascriptExecutor)driver;
			
		js.executeScript("window.scrollTo(0,"+y+")");
		
		Thread.sleep(5000);
		driver.close();
		
	}
}

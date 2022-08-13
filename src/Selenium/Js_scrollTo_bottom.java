package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_scrollTo_bottom 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/");

		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		driver.close();

	}

}

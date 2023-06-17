package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Handling_PopUp_Window
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\Program files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='4.1.2']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\Anil\\autoIT Scripts\\WindowPopUp1");
		
		
		Thread.sleep(3000);
		driver.close();

	}

}

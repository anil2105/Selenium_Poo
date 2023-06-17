package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_URL 
{
	public static void main(String[] args) 
	{
		//Write a script to print the Title & URL?
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//Program files//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize the page
		driver.manage().window().maximize();
		
		//Enter the URL
		driver.get("https://www.hdfc.com");
	
		//Print the title
		String title = driver.getTitle();
		System.out.println("Title of the page= "+title);
		
		//Print URL
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page= "+url);
		
		//Close the browser
		driver.close();
	}		 
	
}

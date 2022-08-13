package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation7.html");
				
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		//Count all the links in the webpage
		int count = allLinks.size();
		System.out.println("Total links: "+count);
		
		//Print all the links in the webpage
		
		/*
		 * for (int i = 0; i<count; i++) 
		 * { 
		 * 		String text = allLinks.get(i).getText();
		 * 		System.out.println(text); 
		 * }
		 */
		
		  for(WebElement ele:allLinks) 
		  { 
		  		System.out.println(ele.getText()); 
		  }
		 
		
	    //Click on any one link except Amazon
		allLinks.get(2).click();
		
		Thread.sleep(3000);
		driver.close();
				
	}
}  

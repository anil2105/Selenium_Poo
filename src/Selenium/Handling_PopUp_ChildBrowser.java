package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_PopUp_ChildBrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.naukri.com/");
	
		//handling child browser Pop-up
		Set<String> allWindows = driver.getWindowHandles();
		
		//How many windows
		int count = allWindows.size();
		
		System.out.println("Total windows: "+count);
		
		//print all the URL
		for(String allwin1 : allWindows)
		{
			System.out.println(allwin1);
			
			String currentUrl = driver.switchTo().window(allwin1).getCurrentUrl();
			System.out.println("URL: "+currentUrl);
		}
		
		//print all the title
		for(String allwin1 : allWindows)
		{
			System.out.println(allwin1);
			
			String title = driver.switchTo().window(allwin1).getTitle();
			System.out.println("Title: "+title);
		}
		
		//close current window
	//	driver.close();
		
		//close specified child window
	//	if (title.equals("Tech Mahindra"))
		{
			driver.close();
		}
		 
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		driver.quit();

	}

}

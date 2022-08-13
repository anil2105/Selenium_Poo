package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleElements_print_allText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation8.html");
		
		List<WebElement> allElements = driver.findElements(By.xpath("//td"));
		
		//count
		int count = allElements.size();
		System.out.println("Total elements: "+count);
		
		//print
		//allElements.get(0).getText(); //--> if only 1 element is there
		
		for (int i = 0; i < count; i++) 
		{
			String text = allElements.get(i).getText(); //--> more than 1 element is there
			
			System.out.println(text);
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}

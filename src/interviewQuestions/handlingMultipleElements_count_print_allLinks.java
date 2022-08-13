package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleElements_count_print_allLinks 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		
		WebElement searchButton = driver.findElement(By.name("q"));
		
		searchButton.sendKeys("Selenium" + Keys.ENTER);
		
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		//count all the links
		int count = allLinks.size();
		System.out.println("Total links: "+count);
		
		//print all the links
		for (int i = 0; i < count; i++) 
		{
			String text = allLinks.get(i).getText();
			
			if (text.length()>0)          //to remove hidden links
			{
				System.out.println(text);
			}
			
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}
}

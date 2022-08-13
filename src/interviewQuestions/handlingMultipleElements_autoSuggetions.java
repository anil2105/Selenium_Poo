package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleElements_autoSuggetions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.google.co.in/");
		
		WebElement searchButton = driver.findElement(By.name("q"));
		
		searchButton.sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> allAutoSugg = driver.findElements(By.xpath("//span[contains(text(), 'selenium')]"));
		
		//count
		int count = allAutoSugg.size();
		System.out.println("Total auto suggetions: "+count);
		
		//print
		for (int i = 0; i <count; i++) 
		{
			String text = allAutoSugg.get(i).getText();
			
			System.out.println(text);
		}
		
		//click on last autoSuggetion
		allAutoSugg.get(count-1).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}
}

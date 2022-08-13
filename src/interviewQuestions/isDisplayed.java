package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.get("http://localhost/login.do;jsessionid=6yv5h1kbrg16");
		
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("anil");
		
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("12345");
		
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		WebElement errorMsg = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		
		if (errorMsg.isDisplayed()) 
		{
			System.out.println("True: Error message is displayed");
		}
		else 
		{
			System.out.println("False: Error message is not displayed");
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}
}

package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 class clearWithoutClearMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("file:///C:/Program%20Files/AutomationPractice/htmlScripts/Sample_Automation5.html");
	
		WebElement unTB = driver.findElement(By.id("un"));
		
		Thread.sleep(2000);
		unTB.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		Thread.sleep(2000);
		driver.close();
	}
}

package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class clearWithoutClearMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation5.html");
	
		WebElement unTB = driver.findElement(By.id("un"));
		
		Thread.sleep(2000);
		unTB.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		Thread.sleep(2000);
		driver.close();
	}
}

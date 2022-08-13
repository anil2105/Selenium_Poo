package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class diffWaysOfClickingButton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://crmaccess.vtiger.com/log-in/");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Sign in']"));
		
		//1st way - click()
	//	loginButton.click();
		
		//2nd way - sendKeys()
		loginButton.sendKeys(Keys.ENTER);
		
		//3rd way - submit()
		loginButton.submit();

		Thread.sleep(3000);
		driver.close();
		
	}
}

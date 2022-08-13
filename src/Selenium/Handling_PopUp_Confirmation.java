package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Handling_PopUp_Confirmation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation12.html");
		
		WebElement clickMeBtn = driver.findElement(By.xpath("//button[.='Click Me']"));
		
		//click
		clickMeBtn.click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
	//	alert.accept(); //clicking on OK btn in pop-up
		
		alert.dismiss(); //clicking on Cancel btn in pop-up
		
		Thread.sleep(3000);
		driver.close();

	}

}

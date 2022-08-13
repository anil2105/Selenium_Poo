package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_PopUp_Alert
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://ksrtc.in/oprs-web/");
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]"));
		searchBtn.click();
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text); //printing alert pop-up text
		
		alert.accept();
		
		//send From location
		driver.findElement(By.id("fromPlaceName")).sendKeys("Bangalore");
		
		
		Thread.sleep(3000);
		driver.close();

	}

}

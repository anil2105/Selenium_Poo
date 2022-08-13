package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_PopUp_HiddenDivisionOrCalender

{
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.cleartrip.com/");
	
		driver.findElement(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div[3]/div/div/div/div/button")).click();;
		
		WebElement departBtn = driver.findElement(By.xpath("(//div[@id='root']/div/div/div/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div/div/div[2]/div/div[3]/div[3]/div[7]/div/div)[1]"));
														     //body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[2]/div[1]/div[1]
					 							             //(//div[text()='20'])[1]
		departBtn.click();
		
		Thread.sleep(3000);
		driver.close();

	}

}

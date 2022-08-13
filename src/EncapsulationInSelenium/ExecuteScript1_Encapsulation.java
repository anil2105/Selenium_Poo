package EncapsulationInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMInSelenium.FaceBookAppInSelenium_POM;

public class ExecuteScript1_Encapsulation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		FaceBookAppInSelenium_Encapsulation f1=new FaceBookAppInSelenium_Encapsulation(driver);
		
				f1.setUserName("Anil");
							
				f1.setPassWord("1234567");
							
				f1.clickOnLoginButton();
							
				Thread.sleep(5000);
				driver.quit();
	}
	
}


package EncapsulationInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMInSelenium.ActiTimeAppInSelenium_POM;

public class ExecuteScript2_Encapsulation
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("http://localhost/login.do");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ActiTimeAppInSelenium_Encapsulation a1=new ActiTimeAppInSelenium_Encapsulation(driver);
		
		//driver.navigate().refresh();
			
				Thread.sleep(2000);
				a1.setUserName("admin");
				
				Thread.sleep(2000);
				a1.setPassWord("manager");
							
				Thread.sleep(2000);
				a1.clickOnChkBox();
							
				Thread.sleep(2000);
				a1.clickOnLoginButton();
							
				Thread.sleep(5000);
				a1.clickOnLoginButton();
							
     			Thread.sleep(5000);
				a1.clickOnActiTimeInc();
					
				Thread.sleep(5000);
				driver.quit();
	
	}
	
}

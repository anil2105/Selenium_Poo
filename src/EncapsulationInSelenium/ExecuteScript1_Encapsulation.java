package EncapsulationInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteScript1_Encapsulation {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		FaceBookAppInSelenium_Encapsulation f1 = new FaceBookAppInSelenium_Encapsulation(driver);
		//driver.navigate().refresh(); //StaleElementReferenceException
		
		f1.setUserName("Anil");

		f1.setPassWord("1234567");

		f1.clickOnLoginButton();

		Thread.sleep(5000);
		driver.quit();
	}

}

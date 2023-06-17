package EncapsulationInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecuteScript2_Encapsulation {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/login.do");
		System.out.println("Webpage opened");
		Thread.sleep(2000);
		
		ActiTimeAppInSelenium_Encapsulation a1 = new ActiTimeAppInSelenium_Encapsulation(driver);
		System.out.println("Object created");
		
		// driver.navigate().refresh(); //StaleElementReferenceException

		a1.setUserName("admin");
		System.out.println("Entered username");

		a1.setPassWord("manager");
		System.out.println("Entered password");

		a1.clickOnChkBox();
		System.out.println("Clicked on check box");

		a1.clickOnLoginButton();
		System.out.println("Clicked on login button");

		Thread.sleep(2000);
		a1.clickOnLoginButton();
		System.out.println("Clicked on logout button");

		Thread.sleep(2000);
		a1.clickOnActiTimeInc();
		System.out.println("Clicked on actiTimeInc link");
		
		Thread.sleep(5000);
		driver.quit();

	}

}

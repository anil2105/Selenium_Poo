package POMInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScript2_POM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("http://localhost/login.do");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ActiTimeAppInSelenium_POM a1=new ActiTimeAppInSelenium_POM(driver);
			
		Thread.sleep(3000);
		
		driver.navigate().refresh();

		Thread.sleep(3000);

							a1.setUserName("admin");
							
							a1.setPassWord("manager");
							
							a1.clickOnChkBox();
							
							a1.clickOnLoginButton();
							
							a1.clickOnLogoutButton();
							
							a1.clickOnActiTimeInc();
							
							Thread.sleep(5000);
							driver.quit();
	}
}

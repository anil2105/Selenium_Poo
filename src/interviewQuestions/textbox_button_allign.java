package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textbox_button_allign {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Users//Admin//Downloads//Program files//geckodriver-v0.30.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://accounts.google.com/ServiceLogin?");
		
		WebElement emailTB = driver.findElement(By.id("identifierId"));
		int x1 = emailTB.getLocation().getX();
		System.out.println(x1);
		
		WebElement nextButton = driver.findElement(By.id("identifierNext"));
		int x2 = nextButton.getLocation().getX();
		System.out.println(x2);
		
		if (x1==x2) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}

package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox_Verify 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://localhost/login.do;jsessionid=6yv5h1kbrg16");
	
		WebElement chkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		if (chkBox.isSelected()) 
		{
			System.out.println("True: Check box is selected");
		}
		else 
		{
			System.out.println("False: Check box is not selected");
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}

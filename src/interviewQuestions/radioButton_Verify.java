package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton_Verify 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/r.php");
		
		WebElement radioBtn = driver.findElement(By.xpath("//label[.='Female']"));
		
		Thread.sleep(2000);
		radioBtn.click();
		
		if (radioBtn.isSelected()) 
		{
			System.out.println("True: Radio Button is selected");
		}
		else 
		{
			System.out.println("False: Radio Button is not selected");
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}
	
}

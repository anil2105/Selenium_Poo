package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTect_getAttribute_program {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("http://localhost/login.do;jsessionid=6yv5h1kbrg16");
		
		//getText -->no parameter
		WebElement text = driver.findElement(By.xpath("//nobr[text()='actiTIME 2016.3']"));
		String text2 = text.getText();
		System.out.println("Text: "+text2);
		
		//getAttribute --> parameter
		WebElement attribute = driver.findElement(By.xpath("//nobr[text()='actiTIME 2016.3']"));
		String attribute2 = text.getText();
		System.out.println("Attribute: "+attribute2);
		
		Thread.sleep(3000);
		driver.close();
	}

}

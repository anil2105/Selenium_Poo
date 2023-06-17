package interviewQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTect_getAttribute_program {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.get("http://localhost/login.do");
		
		//getText -->no parameter
		String text = driver.findElement(By.xpath("//a[contains(text(),'Actimind Inc.')]"))
				.getText(); //inner text of a element
		
		System.out.println("Text: "+text);
		
		//getAttribute --> parameter
		String attribute = driver.findElement(By.xpath("//a[contains(text(),'Actimind Inc.')]"))
				.getAttribute("href"); //value of an attribute
		
		System.out.println("Attribute: "+attribute);
		
		Thread.sleep(3000);
		driver.close();
	}

}

package interviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH_XY_fontSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		WebElement unTB = driver.findElement(By.id("email"));
		
		//width & height
		Dimension wh = unTB.getSize();
		System.out.println("Width & height: "+wh);
		
		//x&y
		Point xy = unTB.getLocation();
		System.out.println("X & Y: "+xy);
		
		//font-size
		String fs = unTB.getCssValue("font-size");
		System.out.println("Font-size: "+fs);
		
		Thread.sleep(3000);
		driver.close();
		
	}
}

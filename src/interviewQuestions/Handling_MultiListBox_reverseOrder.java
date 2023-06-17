package interviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_MultiListBox_reverseOrder
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Admin/Desktop/Anil/htmlScripts/Sample_Automation9.html");
		
		Thread.sleep(2000);
		WebElement listBox = driver.findElement(By.id("book"));
		
		Select select=new Select(listBox);
		
		//getOptions()-->for counting, selecting and deselecting multiple elements
		Thread.sleep(2000);
		List<WebElement> options = select.getOptions(); 
		
		
		//count
		int count = options.size();
		System.out.println("Total elements in list box: "+count);
		
		//print
		for (int i = count-1; i > 0; i--) 
		{
			Thread.sleep(2000);
			String text = options.get(i).getText();
			System.out.println(text);
		
		//select all
		select.selectByIndex(i);
		
		}
		
		//deselect all
		select.deselectAll();
		
		Thread.sleep(3000);
		driver.close();
	}
}

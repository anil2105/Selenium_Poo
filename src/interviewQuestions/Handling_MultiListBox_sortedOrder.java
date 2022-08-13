package interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_MultiListBox_sortedOrder
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
	
		List<WebElement> alloptions = select.getOptions(); 
		
		ArrayList<String> allText=new ArrayList<String>();
		
		//count
		int count = alloptions.size();
		System.out.println("Total elements in list box: "+count);
		
		//print
		for (WebElement option : alloptions) 
		{
			String text = option.getText();
			allText.add(text);
		}
		
		Collections.sort(allText);
		
		for (String text : allText) 
		{
			
			System.out.println(text);
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}

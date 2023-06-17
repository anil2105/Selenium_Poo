package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{
	public static void main(String[] args)
    {
		System.setProperty("webdriver.gecko.driver", "C://Users//Admin//Downloads//Program files//geckodriver-v0.30.0-win64//geckodriver.exe");
		
        //Open the Browser
    	FirefoxDriver f=new FirefoxDriver();

     	//Close the Browser
        f.close();
    }
}

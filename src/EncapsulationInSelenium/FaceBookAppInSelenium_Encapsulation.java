package EncapsulationInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookAppInSelenium_Encapsulation {
	// Declaration

	private WebElement unTB; // private-->within class
	private WebElement pwTB;
	private WebElement loginButton;

	// Initialization [Inside the Constructor]

	public FaceBookAppInSelenium_Encapsulation(WebDriver driver) {
		unTB = driver.findElement(By.id("email"));

		pwTB = driver.findElement(By.id("pass"));

		loginButton = driver.findElement(By.name("login"));

	}

	// Utilization[Inside the Method]

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassWord(String pw) {
		pwTB.sendKeys(pw);

	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

}

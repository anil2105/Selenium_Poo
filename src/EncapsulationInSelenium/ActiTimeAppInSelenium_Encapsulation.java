package EncapsulationInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeAppInSelenium_Encapsulation {
	// Declaration
	private WebElement unTB; // private-->within class

	private WebElement pwTB;

	private WebElement chkBox;

	private WebElement loginButton;

	private WebElement logoutButton;

	private WebElement actiTimeInc;

	// Initialization [Inside the Constructor]

	public ActiTimeAppInSelenium_Encapsulation(WebDriver driver) {
		unTB = driver.findElement(By.id("username"));

		pwTB = driver.findElement(By.name("pwd"));

		chkBox = driver.findElement(By.id("keepLoggedInCheckBox"));

		loginButton = driver.findElement(By.xpath("//div[normalize-space()='Login']"));

		logoutButton = driver.findElement(By.id("logoutLink"));

		actiTimeInc = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));

	}

	// Utilization[Inside the Method]

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassWord(String pw) {
		pwTB.sendKeys(pw);

	}

	public void clickOnChkBox() {
		chkBox.click();
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void clickOnLogoutButton() {
		logoutButton.click();
	}

	public void clickOnActiTimeInc() {
		actiTimeInc.click();
	}

}

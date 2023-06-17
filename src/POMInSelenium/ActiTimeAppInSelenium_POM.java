package POMInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeAppInSelenium_POM
{
		
		//Declaration
		
		@FindBy(id="username")
		private WebElement unTB;  //private-->within class
		
		@FindBy(name="pwd")
		private WebElement pwTB;
	
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement chkBox;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement loginButton;
		
		@FindBy(id="logoutLink")
		private WebElement logoutButton;
		
		@FindBy(xpath="//a[.='actiTIME Inc.']")
		private WebElement actiTimeInc;
		
		
		//Initialization [Inside the Constructor]
		
		public ActiTimeAppInSelenium_POM(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//Utilization[Inside the Method]
		
		public void setUserName(String un)
		{
			unTB.sendKeys(un);
		}
		
		public void setPassWord(String pw)
		{
			pwTB.sendKeys(pw);
			
		}
		
		public void clickOnChkBox()
		{
			chkBox.click();
		}
			
		public void clickOnLoginButton()
		{
			loginButton.click();
		}
		
		public void clickOnLogoutButton()
		{
			logoutButton.click();
		}
		
		public void clickOnActiTimeInc()
		{
			actiTimeInc.click();
		}
	
}

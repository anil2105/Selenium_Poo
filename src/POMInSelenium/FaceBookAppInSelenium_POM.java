package POMInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookAppInSelenium_POM
{
	//Declaration
	
	@FindBy(id="email")
	private WebElement unTB;
	
	@FindBy(id="pass")
	private WebElement pwTB;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	
	//Initialization [Inside the Constructor]
	
	public FaceBookAppInSelenium_POM(WebDriver driver)
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
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
		
}

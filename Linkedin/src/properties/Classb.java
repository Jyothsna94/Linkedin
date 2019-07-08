package properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drivers.Classa;

public class Classb extends Classa{
	
	@FindBy(xpath="//*[@id=\"username\"]")public WebElement Username;
	@FindBy(xpath="//*[@id=\"password\"]")public WebElement password;
	
	public Classb(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UserLogin()
	{
		Username.sendKeys("ujjirijyothsna@yahoo.com");
		password.sendKeys("Ganesh@123");
	}
}
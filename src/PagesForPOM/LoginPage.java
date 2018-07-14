package PagesForPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	//now page factory will provide value of driver
	public LoginPage(WebDriver localDriver)
	{
		this.driver = localDriver;
	}
	
	public void loginflow(String usr, String pwd){
		userName.sendKeys(usr);
		password.sendKeys(pwd);
		loginButton.click();
	}
	
	@FindBy(id="user_login") 
	WebElement userName;
	
	@FindBy(how = How.ID, using = "user_pass")
	WebElement password;
	
	@FindBy(how=How.XPATH, using = "")
	WebElement loginButton;
}

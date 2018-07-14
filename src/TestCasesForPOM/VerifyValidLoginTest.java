package TestCasesForPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import HelperUtility.BrowserFactory;
import PagesForPOM.LoginPage;

public class VerifyValidLoginTest {
	
	@Test
	public void TestValidLoginFunctionality()
	{
		// This will launch browser and specific URL
		WebDriver driver = BrowserFactory.startBrowser("firefox", "");
		
		// Created page object using Page Factory
		//This will return me the page object of the same class
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.loginflow("admin", "admin@123");
	}

}

package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG5 {
	//Using BeforeClass and afterClass annotations
WebDriver driver;//Global Variable 
	
//will be executed once
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test(priority = 1)
	public void verifyGoogleTitle(){
		driver.get("https://www.google.co.in");
		String PageTitle = driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
	}
	@Test(priority = 2)
	public void verifyYahooTitle(){
		driver.get("https://in.yahoo.com");
		String PageHeader = driver.getTitle();
		Assert.assertEquals("Yahoo", PageHeader);
	}
	
	//will be executed once
	@AfterClass
	public void CloseBrowser(){
		driver.close();
	}
}

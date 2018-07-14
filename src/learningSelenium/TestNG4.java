package learningSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG4 {
//using beofreMethod and afterMethod annotations
	
	WebDriver driver;//Global Variable 
	
	@BeforeMethod
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
	@AfterMethod
	public void CloseBrowser(){
		driver.close();
	}
}

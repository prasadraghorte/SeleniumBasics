package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
	//Here we will see multiple test cases and how to prioritize them
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test(priority = 2)
	public void verifyGoogleTitle(){
		driver.get("https://www.google.co.in");
		String PageTitle = driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
	}
	@Test(priority = 3)
	public void verifyFlipkartTitle(){
		driver.get("https://www.flipkart.com");
		String PageHeader = driver.findElement(By.xpath("//*[@title='Flipkart']")).getAttribute("title");
		Assert.assertEquals("Flipkart", PageHeader);
	}
	@Test(priority = 4)
	public void CloseBrowser(){
		driver.close();
	}

}

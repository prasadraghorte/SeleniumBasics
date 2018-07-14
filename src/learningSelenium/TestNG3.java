

package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG3 {
	//Now we will use dependsOnMethods to set the execution flow
	
	WebDriver driver;
	
	@Test
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test(dependsOnMethods = "openBrowser")
	public void verifyGoogleTitle(){
		driver.get("https://www.google.co.in");
		String PageTitle = driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
	}
	@Test(dependsOnMethods = "verifyGoogleTitle")
	public void verifyFlipkartTitle(){
		driver.get("https://www.flipkart.com");
		String PageHeader = driver.findElement(By.xpath("//*[@title='Flipkart']")).getAttribute("title");
		Assert.assertEquals("Flipkart", PageHeader);
	}
	@Test(dependsOnMethods = "verifyFlipkartTitle")
	public void CloseBrowser(){
		driver.close();
	}

}

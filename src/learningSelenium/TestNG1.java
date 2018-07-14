
package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG1 {
	
	//This is first TestNG test case with no main method.
	@Test
	public void VerifyTitle(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		String str = driver.getTitle();
		//Assert method introduced in test NG which decides test passed or failed.
		Assert.assertEquals("Google", str);
		driver.close();
		
	}
	

}

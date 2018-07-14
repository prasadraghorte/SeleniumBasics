package SeleniumEssentials;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CookiesInSelenium {
	
	WebDriver driver;
	@Test
	public void deleteCookiesinSelenium()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//No code to delete a specific cookie
		driver.manage().deleteCookieNamed("gpv_pn");
		
		//code to display all cookies in console
		Set<Cookie> cookieList = driver.manage().getCookies();
		for(Cookie getcookies : cookieList)
		{
			System.out.println(getcookies);
		}
		driver.quit();
		
	}

}


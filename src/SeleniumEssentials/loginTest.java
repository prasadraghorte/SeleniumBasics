package SeleniumEssentials;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class loginTest extends TestBase {
	WebDriver driver;
	@BeforeClass
	public void init() throws IOException
	{
		setup();
		System.setProperty("webdriver.chrome.driver", "H:/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void login()
	{
		driver.get((String) or.get("url"));
	}

}

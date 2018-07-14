package learningSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleBrowsers {
	public static WebDriver driver;
	public static int browser;
	public static String BrowserName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(browser = 1; browser <=2; browser++)
		{
			if(browser == 1)
			{
				System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
				driver = new FirefoxDriver();
				BrowserName = "Mozilla";
			}
			if(browser == 2)
			{
				System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/AppData/Local/Google/Chrome/Application/chrome.exe");
				driver = new ChromeDriver();
				BrowserName = "Chrome";
				//driver.manage().window().maximize();
			}
			
			driver.get("https://www.google.co.in");
			String PageTitle = driver.getTitle();
			System.out.println(PageTitle);
			
			if(PageTitle.equals("Google"))
			{
				System.out.println("Google opened successfully on " + BrowserName);
			}
			else
			{
				System.out.println("Google did not open on " + BrowserName);
			}
			driver.quit();
		}
		System.out.println("Test performed on all browsers successfully");
	}

}

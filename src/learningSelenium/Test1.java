package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		// Test case to verify internal and external links in wikipedia.org
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		System.out.println("Navigated to wikidepdia page");
		
		//First Verification of internal Link
		WebElement internalLink = driver.findElement(By.xpath(".//*[@id='pt-createaccount']/a"));
		internalLink.click();
		
		String URL = driver.getCurrentUrl();
		
		if(URL.contains("wikipedia.org"))
		{
			System.out.println("This is an inetrnal link which redirect to wiki itself_First Verification passed");
		}
		else
		{
			System.out.println("It is an external link which navigated to other app_First verification Failed");
		}
		driver.navigate().back();
		
		//Second Verification_External Link
		WebElement externalLink = driver.findElement(By.partialLinkText("seleniumhq.org"));
		externalLink.click();
		URL = driver.getCurrentUrl();
		
		if(!URL.contains("wikipedia.org"))
		{
			System.out.println("It is an external link  which navigated to other app_Second verification Passed" );
		}
		else
		{
			System.out.println("It is an internal link_Second Verification failed");
		}
		driver.quit();
		System.out.println("All verification checked successfully.");
		
	}

}

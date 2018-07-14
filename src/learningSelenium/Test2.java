package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		System.out.println("Navigated to google website");
		
		WebElement link = driver.findElement(By.linkText("Gmail"));
		
		boolean visibility = link.isDisplayed();
		
		if(visibility == true)
		{
			System.out.println("Gmail link is disaplyed");
		}
		else
		{
			System.out.println("Link not displayed");
		}
	}

}

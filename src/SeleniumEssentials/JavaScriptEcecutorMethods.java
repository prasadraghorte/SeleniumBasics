package SeleniumEssentials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptEcecutorMethods {
	WebDriver driver;
	@Test
	public void javaScript()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor webdriver = (JavascriptExecutor)driver;
		//Enter text udsing javascript executor
		webdriver.executeScript("document.getElementById('email').setAttribute('value','abc@gmail.com')");
		webdriver.executeScript("document.getElementById('pass').setAttribute('value','password')");
		
		//Click using Javascript Executor
		webdriver.executeScript("arguments[0].click();",driver.findElement(By.xpath("//label[@id='loginbutton']")));
	
		//Scroll using Javascript Executor
		webdriver.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.navigate().back();
		//webdriver.executeScript("window.scrollBy(0,1500)");
		webdriver.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[contains(text(),'Help')]")));
	
		//Fetching the URL, domain and title of application
		String domain = webdriver.executeScript("return document.domain;").toString();
		String url = webdriver.executeScript("return document.URL;").toString();
		String title = webdriver.executeScript("return document.title;").toString();
		System.out.println(domain + " " + url + " " + title);
		driver.quit();
	}
}

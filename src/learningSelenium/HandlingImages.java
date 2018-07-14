


package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		
		WebElement elemnt = driver.findElement(By.xpath(".//*[@id='hplogo']"));
		elemnt.isDisplayed();
		String str = elemnt.getAttribute("title");
		System.out.println(str);
		
		driver.navigate().to("http://newtours.demoaut.com");
		WebElement elemnt2 = driver.findElement(By.xpath(".//*[@name='login']"));
		elemnt2.isDisplayed();
		elemnt2.click();
		
		driver.navigate().to("http://www.seleniumhq.org/");
		WebElement elemnt3 = driver.findElement(By.xpath("//*[@id='choice']/tbody/tr/td[2]/center/a/img"));
		elemnt3.isDisplayed();
		elemnt3.click();
		
		driver.quit();

	}

}

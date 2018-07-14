package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//ADMIN//AppData//Local//Google//Chrome//Application//chromedriver.exe");
		//Creating firefoxDriver in WebDriver interface
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.hotstar.com/");
		
		//Create action builder instance by passing WebDriver instance i.e.
		//Creating object of actions class by passing driver instance
		Actions builder = new Actions(driver);//Syntax
		WebElement menu = driver.findElement(By.xpath("//button[@class='btn-hamburger dropdown-toggle ng-scope']"));
		//WebElement menu = driver.findElement(By.className("btn-hamburger dropdown-toggle ng-scope ng-hide"));
		builder.moveToElement(menu).build().perform();
		System.out.println("Hovered");
		driver.findElement(By.xpath(".//*[@id='primary-nav']/li[2]/div/div/ul/li[6]/a")).click();
		System.out.println("Navigated to star world");
		driver.quit();
	}

}

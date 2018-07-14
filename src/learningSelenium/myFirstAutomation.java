package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myFirstAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys("abc@xyz.com");

		driver.findElement(By.xpath(".//*[@id='u_0_0']")).click();
	}

}

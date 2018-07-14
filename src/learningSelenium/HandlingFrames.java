package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//Switch to 3rd frame using frame index
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		System.out.println("Switched to 3rd frame using index4");
		
		//Switch from 3rd frame to Top Window
		driver.switchTo().defaultContent();
		System.out.println("Switched to default frame");
		
		//Switch to 1st frame using frame name
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
		System.out.println("Switched to first frame using name");
		driver.quit();
	}

}

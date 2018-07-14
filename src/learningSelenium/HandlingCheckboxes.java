package learningSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		//for checkbox1 of hobby singing
		WebElement chkbx1 = driver.findElement(By.xpath(".//*[@id='sing']"));
		boolean status = chkbx1.isSelected();
		System.out.println("previous status of box1 was" + status);
		
		chkbx1.click();
		status = chkbx1.isSelected();
		System.out.println("Current status of box1 is" + status);
		
		//for checkbox2 of coding
		WebElement chkbx2 = driver.findElement(By.xpath(".//*[@id='code']"));
		status = chkbx2.isSelected();
		System.out.println("previous status of box2 was" + status);
		
		chkbx2.click();
		status = chkbx2.isSelected();
		System.out.println("Current status of box1 is" + status);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		driver.quit();
		
	}

}

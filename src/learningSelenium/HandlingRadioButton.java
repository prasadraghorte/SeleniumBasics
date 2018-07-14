package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@name='gender'and @value='m']"));
		boolean elementStatus = radio1.isSelected();
		System.out.println(elementStatus);
		radio1.click();
		elementStatus = radio1.isSelected();
		System.out.println(elementStatus);
		
		WebElement radio2 = driver.findElement(By.xpath("//*[@name='gender'and @value='f']"));
		boolean elementStatus2 = radio2.isSelected();
		System.out.println(elementStatus2);
		radio2.click();
		elementStatus2 = radio2.isSelected();
		System.out.println(elementStatus2);
		driver.quit();
	}

}

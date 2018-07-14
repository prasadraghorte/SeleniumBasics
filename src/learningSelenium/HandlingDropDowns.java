
package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		
		Select dropDown = new Select(driver.findElement(By.xpath(".//*[@name = 'country']")));
		
		dropDown.selectByIndex(2);
		dropDown.selectByIndex(3);
		dropDown.selectByIndex(4);
		dropDown.selectByVisibleText("Angola");
		
		List<WebElement> e = dropDown.getOptions();
		int count = e.size();
		System.out.println("Total no of countries in this dropdown is " + count);
		driver.quit();
		
	}

}

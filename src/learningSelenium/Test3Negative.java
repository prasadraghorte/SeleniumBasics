package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");

		WebElement userID = driver.findElement(By.xpath("//*[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='tdb1']"));
		
		userID.sendKeys("admina");
		password.sendKeys("admin@123");
		loginButton.click();
		
		String ErrorMessage = driver.findElement(By.xpath("//*[@class='messageStackError']")).getText();
		
		if(ErrorMessage.contains("Invalid administrator login attempt.")){
			System.out.println("Negative scenario handled successfully");
		}
		else{
			System.out.println("application issue test failed....");
		}
	}

}

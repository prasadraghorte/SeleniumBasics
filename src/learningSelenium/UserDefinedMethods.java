package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserDefinedMethods {
	
	public static WebDriver driver;
	
	//Method for successfully logging into the app
	public void LoginAdmin(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");

		WebElement userID = driver.findElement(By.xpath("//*[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='tdb1']"));
		
		userID.sendKeys("admin");
		password.sendKeys("admin@123");
		loginButton.click();
		}
	
	//OverLoaded method with parameters
	public void LoginAdmin(String username, String Password){
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/");

		WebElement userID = driver.findElement(By.xpath("//*[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='tdb1']"));
		
		userID.sendKeys(username);
		password.sendKeys(Password);
		loginButton.click();
		}
	
	//Method used to verify successful login
	//Return true after successful login and false for unsuccessful
	public boolean IsLoginSuccessful(){
		String URL = driver.getCurrentUrl();
		if(URL.contains("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Logged in successfully_Test Passed");
			return true;
		}
		else{
			System.out.println("User is unable to login_Test Failed");
			return false;
		}
	}

	public static void main(String[] args) throws InterruptedException{
		// Object Creation
		UserDefinedMethods M1 = new UserDefinedMethods();
		M1.LoginAdmin();
		Thread.sleep(3000);
		M1.IsLoginSuccessful();
		driver.close();
		
		/*M1.LoginAdmin("admin", "admin@123");
		Thread.sleep(3000);
		M1.IsLoginSuccessful();
		driver.quit();*/
	}

}

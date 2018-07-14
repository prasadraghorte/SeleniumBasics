package SeleniumEssentials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {
	WebDriver driver;
	@Test
	public void TestFragAndDrop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//action will not be performed on these objects as they are under a different iframe
		//Hence we have to shift to this frame first
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		//Create an object of action class to use drag and drop method
		Actions builder = new Actions(driver);
		builder.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}

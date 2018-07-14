package learningSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in");
		
		WebElement htmltable = driver.findElement(By.xpath("//*[@id='post-body-2347438380991301498']/table/tbody"));
		
		//We will get value from any particular cell
		String cellValue = driver.findElement(By.xpath("//*[@id='post-body-2347438380991301498']/table/tbody/tr[1]/td[3]")).getText();
		System.out.println("String in 1stRow 3rdCloumn is " + cellValue);
		
		//make list of rows of box and get count of row
		List<WebElement> row = htmltable.findElements(By.tagName("tr"));
		int rowcount = row.size();
		System.out.println("Count of row " + rowcount);
		//System.out.println("List of row " + row);
		
		//make list of total cell of box
		List<WebElement> cell = htmltable.findElements(By.tagName("td"));
		int cellcount = cell.size();
		
		System.out.println("count of cell is "+cellcount);
		//System.out.println("list of cell is "+cell);
		
		driver.quit();
	}

}

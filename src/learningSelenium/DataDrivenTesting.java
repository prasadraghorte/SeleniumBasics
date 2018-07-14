
package learningSelenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("C:\\Users\\ADMIN\\Desktop\\input.txt");
		BufferedReader br = new BufferedReader(file);
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/ADMIN/Downloads/geckodriver-v0.18.0-win64/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		int count = 0;
		int iteration = 0;
		String line;
		
		while((line = br.readLine())!=null)
		{
			count = count +1;
			iteration = iteration +1;
		
		
			if(count >=1)
			{
			String [] Testdata = line.split(", ", 2);
			driver.get("http://www.gcrit.com/build3/admin");
			driver.findElement(By.name("username")).sendKeys(Testdata[0]);
			driver.findElement(By.name("password")).sendKeys(Testdata[1]);
			//driver.findElement(By.id("tdb1")).click();
			driver.findElement(By.name("username")).clear();
			driver.findElement(By.name("password")).clear();
			}
		}
		br.close();
		file.close();
	}

}

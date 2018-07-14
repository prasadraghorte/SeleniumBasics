package learningSelenium;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestProperties extends TestBase {
	
	@Test 
	public void testProperties() throws IOException
	{
		String name = getObject("Name");
		//System.out.println(name);
		
		String company = getObject("Company");
		System.out.println(company);
		
		String designation = getObject("Designation");
		String empid = getObject("EmpID");
		
		System.out.println("My name is "+name+" from "+company+" and my desgnation is "+designation+ " and Employee ID is "+empid);
		
	}
}

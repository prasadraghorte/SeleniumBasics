package learningSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyXMLClass2 {
	@BeforeClass
	  public void login() {
		  System.out.println("Logged in successfully");
	  }
	  @Test (priority =4)
	  public void deleteVendor() {
		  System.out.println("Deleted vendor successfully");
	  }
	  @Test (priority = 5)
	  public void deleteProduct() {
		  System.out.println("Deleted Product successfully");
	  }
	  @Test (priority = 6)
	  public void deleteCurrency() {
		  System.out.println("Deleted Currency successfully");
	  }
	  @AfterClass
	  public void logout() {
		  System.out.println("Logged out successfully");
	  }
}

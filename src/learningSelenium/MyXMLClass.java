package learningSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyXMLClass {
  @BeforeClass
  public void login() {
	  System.out.println("Logged in successfully");
  }
  @Test (priority = 1)
  public void addVendor() {
	  System.out.println("Added vendor successfully");
  }
  @Test (priority = 2)
  public void addProduct() {
	  System.out.println("Added Product successfully");
  }
  @Test (priority = 3)
  public void addCurrency() {
	  System.out.println("Added Currency successfully");
  }
  @AfterClass
  public void logout() {
	  System.out.println("Logged out successfully");
  }
}

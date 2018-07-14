package learningSelenium;

import org.testng.annotations.Test;

public class TestNG6GroupingTests {
	@Test (groups = {"sanity", "regression"},priority=1)
	public void login()
	{
		System.out.println("Logged in successfully");
	}
	
	@Test (groups = {"regression"},priority=4)
	public void billPayment()
	{
		System.out.println("Bills Paied successfully");
	}
	
	@Test (groups = {"sanity"},priority=2)
	public void search()
	{
		System.out.println("Searched successfully");
	}
	
	@Test (groups = {"sanity", "regression"},priority=3)
	public void prepaidRecharge()
	{
		System.out.println("Recharge successful");
	}
	
	@Test (groups = {"regression"},priority=5)
	public void advancedSearch()
	{
		System.out.println("Advanced searched successfully");
	}
	
	@Test (groups = {"sanity", "regression"},priority=6)
	public void logout()
	{
		System.out.println("Logged out successfully");
	}

}

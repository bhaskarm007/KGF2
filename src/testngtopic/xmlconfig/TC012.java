package testngtopic.xmlconfig;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Script to understand how (invocationCount =2) works
public class TC012 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running beforeMethod");
		}
	
	@Test(invocationCount=2)
	public void testCase() {
		System.out.println("Running testCase");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running afterMethod");
     }
}

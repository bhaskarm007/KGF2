package testngtopic.xmlconfig;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Configuration Annotations of TestNG
// Script to understand @Before and @Aftermethod
public class TC011 {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running beforeMethod");
		}
	
	@Test
	public void testCase() {
		System.out.println("Running testCase");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running afterMethod");
}
}
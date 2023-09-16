package testngtopic.xmlconfig;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Script to understand inheritance
public class TC016 extends BaseTest {

	@BeforeMethod
	public void BeforeMethod4Comment() {
		System.out.println("Running BeforeMethod4Comment");
	}
	
	@Test
	public void addComment() {
		System.out.println("Running addComment testCase");
	}
	
	@AfterMethod
	public void afterMethod4Comment() {
		System.out.println("Running afterMethod4Comment");
	}
}

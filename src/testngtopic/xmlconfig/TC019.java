package testngtopic.xmlconfig;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Script to understand @BeforeClass and @AfterClass with invocation
public class TC019 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Running beforeClass");
	}
	
	@Test(invocationCount = 2)
	public void addCloseFriend1() {
		System.out.println("Running addCloseFriend1 testCase");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Running afterClass");
		
	}
}

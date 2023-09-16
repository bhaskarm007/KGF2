package testngtopic.xmlconfig;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Script to understand @BeforeClass and @AfterClass
public class TC018 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running beforeClass");
	}
	
	@Test
	public void addcloseFriend() {
		System.out.println("Running addCloseFriend testCases");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Running afterClass");
	}
}

package testngtopic.xmlconfig;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// Script to understand @BeforeClass and @AfterClass, it's dependency
//               on how many times execute TestNG class
public class TC020 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Running beforeClass");
	}
	
	@Test
	public void addCloseFriend1() {
		System.out.println("Running addCloseFriend1 testCase");
	}

	@Test
	public void addCloseFriend2() {
		System.out.println("Running addCloseFriend2 testCase");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Running afterClass");
		
	}
}

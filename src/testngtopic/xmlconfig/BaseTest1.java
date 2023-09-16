package testngtopic.xmlconfig;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

// Script to understand @BeforeTest and @AfterTests
public class BaseTest1 {
 
	@BeforeTest
	public void beforetest() {
		System.out.println("Running beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Running afterTest");
	}
	

}

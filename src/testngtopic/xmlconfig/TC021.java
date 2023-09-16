package testngtopic.xmlconfig;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC021 {

	@BeforeTest
	public void beforeTest() {
		System.out.println("Running beforeTest");
	}
	
	@Test
	public void addFamily() {
		System.out.println("Running addFamily testCase");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Running afterTest");
	}
}

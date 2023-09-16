package testngtopic.xmlconfig;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Script to understand method Overriding
public class TC017 extends BaseTest {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running Overridden beforeMethod of subclass");
		}
	
	@Test
	public void addGirlFriend() {
		System.out.println("Running addGirlFriend testCase");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running Overridden afterMethod of subclass");
     }

}

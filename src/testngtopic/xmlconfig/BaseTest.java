package testngtopic.xmlconfig;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

// Script to understand creating BaseTest class for:-TC014 and TC015
public class BaseTest {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Running beforeMethod");
		}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Running afterMethod");
     }
}

package testngtopic.xmlconfig;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Script to understand Parameterization in different browser
public class TC006 {

	@Parameters({"browser"})
	@Test
	public void testLogin3(String browser) {
		System.out.println("From testLogin3::"+browser);
	}
}

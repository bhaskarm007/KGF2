package testngtopic.xmlconfig;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Script to understand Parameterization system level(IP Address::)
public class TC004 {

	@Parameters({"browser", "url"})
	@Test
	public void testLogin1(String b, String u) {
		System.out.println("From testLogin1::"+b);
		System.out.println("From testLogin1::"+u);
	}
}
 
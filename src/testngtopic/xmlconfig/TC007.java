package testngtopic.xmlconfig;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Script to understand @Optional 
public class TC007 {

	@Parameters({"browser"})
	@Test
	public void testLogin4(@Optional("edge")String browser) {
		System.out.println("From testLogin4::"+browser);
	}
}

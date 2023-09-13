package testngtopic;

import org.testng.Reporter;
import org.testng.annotations.Test;

// Script to Understand Reporter.Log
public class ReportLog {

	@Test
	public void testAddToKart() {
		Reporter.log("Running test case testAddToKart", true);
	}
	
}

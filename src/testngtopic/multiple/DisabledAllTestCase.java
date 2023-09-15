package testngtopic.multiple;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

// Script to understand disabled all test case in class(Ignore)
@Ignore
public class DisabledAllTestCase {

	@Test
	public void addFriend() {
		System.out.println("Running addFriend Test Case1");
	}
	
	@Test
	public void addCloseFriend() {
		System.out.println("Running addCloseFriend Test Case1");
	}
	
	@Test
	public void addComment() {
		System.out.println("Running addComment Test Case1");
	}
	
	@Test
	public void addProfilePic() {
		System.out.println("Running addProfilePic Test Case1");
	}
}

/* Output
 
[TestNG] No tests found. Nothing was run
*/
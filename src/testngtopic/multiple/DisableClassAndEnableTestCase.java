package testngtopic.multiple;

import org.testng.annotations.Test;

// Script to understand Disable Class and Enable TestCase 
@Test(enabled = false)
public class DisableClassAndEnableTestCase {

	public void addFriend() {
		System.out.println("Running addFriend Test Case1");
	}
	
	public void addCloseFriend() {
		System.out.println("Running addCloseFriend Test Case1");
	}
	
	@Test(enabled=true)
	public void addComment() {
		System.out.println("Running addComment Test Case1");
	}
	
	public void addProfilePic() {
		System.out.println("Running addProfilePic Test Case1");
	}
}

/* Output
Running addComment Test Case1
*/
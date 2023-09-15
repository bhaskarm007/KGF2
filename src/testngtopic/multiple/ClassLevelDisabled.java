package testngtopic.multiple;

import org.testng.annotations.Test;

//Script to understand disabled all test cases on class level(enabled =false)

@Test(enabled =false)
public class ClassLevelDisabled {

	public void addFriend() {
		System.out.println("Running addFriend Test Case1");
	}
	
	public void addCloseFriend() {
		System.out.println("Running addCloseFriend Test Case1");
	}
	
	public void addComment() {
		System.out.println("Running addComment Test Case1");
	}
	
	public void addProfilePic() {
		System.out.println("Running addProfilePic Test Case1");
	}
}
/* Output
[TestNG] No tests found. Nothing was run
*/

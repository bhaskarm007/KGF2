package testngtopic.multiple;

import org.testng.annotations.Test;

// Script to understand @Test Annotation on class level
@Test
public class ClassLevelTestAnnotation {

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
Running addCloseFriend Test Case1
Running addComment Test Case1
Running addFriend Test Case1
Running addProfilePic Test Case1
*/

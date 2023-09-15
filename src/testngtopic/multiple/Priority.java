package testngtopic.multiple;

import org.testng.annotations.Test;

// Script to understand we can use Multiple Test Cases
public class Priority {

	@Test
	public void addFriend() {
		System.out.println("Running addFriend Test Case");
	}
	
	@Test
	public void addCloseFriend() {
		System.out.println("Running addCloseFriend Test Case");
	}
	
	@Test
	public void addComment() {
		System.out.println("Running addComment Test Case");
	}
	
	@Test
	public void addProfilePic() {
		System.out.println("Running addProfilePic Test Case");
	}
	
}

/* Output

Running addCloseFriend Test Case
Running addComment Test Case
Running addFriend Test Case
Running addProfilePic Test Case
*/

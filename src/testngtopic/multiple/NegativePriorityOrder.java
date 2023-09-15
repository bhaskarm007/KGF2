package testngtopic.multiple;

import org.testng.annotations.Test;

// Script to understand -ve Negative priority Execution order
public class NegativePriorityOrder {

	@Test(priority=-2)
	public void addFriend() {
		System.out.println("Running addFriend Test Case");	
	}
	
	@Test(priority =1)
	public void addCloseFriend() {
		System.out.println("Running addCloseFriend Test Case");
	}
	
	@Test
	public void addComment() {
		System.out.println("Running addComment Test Case");
	}
	
	@Test(priority=-1)
	public void addProfilePic() {
		System.out.println("Running addProfilePic Test Case");
	}
}

/* Output

Running addFriend Test Case
Running addProfilePic Test Case
Running addComment Test Case
Running addCloseFriend Test Case

*/

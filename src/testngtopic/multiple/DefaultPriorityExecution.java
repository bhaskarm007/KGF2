package testngtopic.multiple;

import org.testng.annotations.Test;

// Script to understand Default priority Execution order
public class DefaultPriorityExecution {

	@Test(priority=1)
	public void addFriend() {
		System.out.println("Running addFriend Test Case");	
	}
	
	@Test(priority =2)
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


Running addComment Test Case
Running addProfilePic Test Case
Running addFriend Test Case
Running addCloseFriend Test Case

*/
package testngtopic.multiple;

import org.testng.annotations.Test;

// Script to understand how to give priority our own order

public class PriorityOurOwnOrder {

	@Test(priority=1)
	public void addFriend() {
		System.out.println("Running addFriend Test Case");	
	}
	
	@Test(priority =2)
	public void addCloseFriend() {
		System.out.println("Running addCloseFriend Test Case");
	}
	
	@Test(priority=4)
	public void addComment() {
		System.out.println("Running addComment Test Case");
	}
	
	@Test(priority=3)
	public void addProfilePic() {
		System.out.println("Running addProfilePic Test Case");
	}
	
}

/*Output
 
Running addFriend Test Case
Running addCloseFriend Test Case
Running addProfilePic Test Case
Running addComment Test Case

*/

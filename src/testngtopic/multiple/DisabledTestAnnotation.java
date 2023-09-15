package testngtopic.multiple;

import org.testng.annotations.Test;

//Script to understand (enabled =false) disabled @Test Annotation

public class DisabledTestAnnotation {

	@Test
	public void addFrien() {
		System.out.println("Running addFriend Test Case");
	}
	
	@Test(enabled=false)
	public void addCloseFriend() {
		System.out.println("Running addCloseFriend Test Case");
	}
	
	@Test
	public void addComment() {
		System.out.println("Running addComment Test Case");
	}
	
	@Test(enabled= false)
	public void addProfilePic() {
		System.out.println("Running addProfilePic Test Case");
	}
}

/*
Running addComment Test Case
Running addFriend Test Case

 */ 

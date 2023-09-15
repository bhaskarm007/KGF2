package testngtopic.multiple;

import org.testng.annotations.Test;

// Script to understand Grouping the Test Cases
public class GroupDependency {

	@Test(groups="login")
	public void login() {
		System.out.println("Running login Test Case");
	}
	
	@Test(groups="friend")
	public void addFriend() {
		System.out.println("Running addFriend Test Case");
	}
}

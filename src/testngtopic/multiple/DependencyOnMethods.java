package testngtopic.multiple;

import org.testng.Assert;
import org.testng.annotations.Test;

// Script to understand Dependency in TestNG
public class DependencyOnMethods {

	@Test
	public void login() {
		System.out.println("Running login Test Case");
//   Assert.fail("Login UnSuccessFull"); if failure then both addFriend and deleteFriend will be skipped
	}
	
	@Test(dependsOnMethods="login")
	public void addFriend() {
		System.out.println("Running addFriend Test Case");
		Assert.fail("addFriend Unsuccessfull");// if failure or skipped the deleteFriend will Skipped
	}
	
	@Test(dependsOnMethods= {"login", "addFriend"})
	public void deleteFriend() {
		System.out.println("Running deleteFriend Test Case");
	}
	
}
// IQ*** When TestNG will flag tests as Skipped
//           Whenever the dependent method fails

package testngtopic.multiple;

import org.testng.annotations.Test;

// this program is dependent on |GroupDependency program
// Script to understand Dependent test methods present in other class
public class Dependency {

	@Test(dependsOnGroups = "login")
	public void testComment() {
		System.out.println("Running testComment Test Case");
	}

}
/* Output

Running login Test Case
Running testComment Test Case
*/
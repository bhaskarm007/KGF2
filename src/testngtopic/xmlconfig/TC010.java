package testngtopic.xmlconfig;

import org.testng.annotations.Test;

// Script to understand Group Execution

public class TC010 {

	@Test(groups= {"smoke","customer"})
	public void createCustomer() {
		System.out.println("Running Create Customer Test case");
	}
	
	@Test(groups= {"customer"})
	public void deleteCustomer() {
		System.out.println("Running Create Customer Test case");
	}
	
	@Test(groups= {"smoke", "project"})
	public void createProject() {
		System.out.println("Running Create Customer Test case");
	}
	
	@Test(groups ="project")
	public void deleteProject() {
		System.out.println("Running Create Customer Test case");
	}
}

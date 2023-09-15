package testngtopic.multiple;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Script to understand we have to give argument to @Test 
public class ArgumentDataProvider {

	@DataProvider(name="NumericValues")
	public Integer[] getData() {
		Integer[] arr = {10, 20, 30, 40, 50};
		return arr;
	}
	
	@Test(dataProvider = "NumericValues")
	public void testSomething(int a) {
		System.out.println("Hello World");
	}
}

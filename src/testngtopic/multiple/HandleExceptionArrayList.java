package testngtopic.multiple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Script to understand Handle Exception on Array List
public class HandleExceptionArrayList {

	@DataProvider(name="getProductIds")
	public Iterator<String> testData() {
		List<String> productIdsList = new ArrayList<String>();
		productIdsList.add("id_product=10");
		productIdsList.add("id_product=20");
		productIdsList.add("id_product=30");
		productIdsList.add("id_product=40");
		productIdsList.add("id_product=50");
		return productIdsList.iterator();
	}
	
	@Test(dataProvider = "getProductIds")
	public void testProducts(String productId) {
		System.out.println("From Test Case::"+productId);
	}
}

package testngtopic.multiple;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Script to Understand higher level of Object type
public class HigherLevelObjectType {

	@DataProvider(name="courseDetials")
	public Object[][] testData() {
//		Object[][] arr = {{"JavaCourse", 90},{"SeleniumCourse",20},{"ProjectCourse",40}};
//			return arr;
		return new Object[][] {{"JavaCourse", 90},{"SeleniumCourse",20},{"ProjectCourse",40}};
	}
	
	@Test(dataProvider = "courseDetails")
	public void testCourse(String courseName, int yoe) {
		System.out.println("courseName="+courseName);
		System.out.println("Experience="+yoe);
	}	
}

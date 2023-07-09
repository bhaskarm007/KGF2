package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//Creating Custom Expected Conditions class which is clubbed with lot of
//custom conditions and All are static methods

//NOTE(FYI):: It's an exact Replica of ExpectedCondtions Library class of Selenium 3.XX/4.XX
//NOTE(FYI):: In Real Time Automation Framework this class will be usually developed to handle certain
//            Explicit conditions Which are not provided in selenium Library class ExpectedConditions
public class MyExpectedConditions { 
	

public static ExpectedCondition<Boolean>MyTitleIs(String expectedTitle){
	
	return new ExpectedCondition<Boolean>() {
          String actualTitle;
          
		@Override
		public Boolean apply(WebDriver driver) {
			actualTitle = driver.getTitle();
			
			return actualTitle.equals(expectedTitle);
		}
		@Override
		public String toString() {
			
			return "Sorry, expectedTitle="+expectedTitle+", but actualTitle="+actualTitle;
		}
	};
}

public static ExpectedCondition<Boolean>PageSourceContainsText(String expectdText){
	return new ExpectedCondition<Boolean>() {

		@Override
		public Boolean apply(WebDriver driver) {
			
			return driver.getPageSource().contains(expectdText);
		}
@Override
public String toString() {
	
	return "Sorry, "+expectdText+"is not present in the source code";
     }	
   };
}

}

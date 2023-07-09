package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//Implemented Custom ExpectedCondition class to take Arguments
//1.Create a parameterized constructors
//2.Assign the values from constructor to global variables
//3.Use the same initialized variables in apply() and toString() methods as per your need.

//NOTE:: toString() method is only called in case of failure

public class MyCondition3 implements ExpectedCondition <Boolean> {
 
	String expectedTitle;
    String actualTitle;
 
 public MyCondition3(String expectedTitle) {
	this.expectedTitle=expectedTitle;
}
 
	@Override
	public Boolean apply(WebDriver driver) {
		actualTitle=driver.getTitle();
		return actualTitle.equals(expectedTitle);
	}
	@Override
		public String toString() {
			
			return "Sorry, expectedTitle="+expectedTitle+", but actualTitle="+actualTitle;
		}

}

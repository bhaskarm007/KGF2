package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//Creating another Custom ExpectedConditon

public class PageSourceContainsText implements ExpectedCondition<Boolean> {

	String expectedText;
	public PageSourceContainsText(String expectedText) {
	this.expectedText=expectedText;
	}
	
	@Override
	public Boolean apply(WebDriver driver) {
		
		return driver.getPageSource().contains(expectedText);
	}
	
   @Override
     public String toString() {
	return "Sorry, " +expectedText+" is not present in the source code";
}
}
//Anonymous class?
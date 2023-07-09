package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyCondition2 implements ExpectedCondition <Boolean> {

	@Override
	public Boolean apply(WebDriver driver) {
		
		return driver.getTitle().equals("Mahi");
	}
	//t=ctrl+space press then it will show the string override opetion
	
	@Override
	public String toString() {
		
		return "Sorry, Title is not Mahi";
	}

}

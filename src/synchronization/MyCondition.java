package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyCondition implements ExpectedCondition<Boolean> {

	@Override
	public Boolean apply(WebDriver driver) {
		
		return driver.getTitle().equals("Google");
	}

}

package javascriptexcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Library method to highlighted the target WebElement and click on it
public class LibraryClass {

	public static void higlightedAndClick(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='2px solid red';", ele);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		ele.click();
	}
}

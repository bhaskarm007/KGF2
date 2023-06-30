package webelements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LibraryClass {
	public static boolean verifyEnterdText(WebElement ele, String expectedText) {
		if(ele.getTagName().equals("input") && ele.getAttribute("type").equals("text")) {
			if(ele.getAttribute("value").equals(expectedText)) {
				return true;
			}else {
				return false;
			}
		} else {
			throw new IllegalArgumentException("The tagName should be input and type should be the Text");
		}
		
	}
}

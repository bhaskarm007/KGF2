package handlingautosuggestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlphabeticalOrder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ibegin.tcs.com/iBegin/register");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[placeholder='Enter your skills in order of expertise (Maximum 5)']"))
		.sendKeys("Testing");
		
		List<WebElement> autoSuggestion = driver.findElements(By.cssSelector("li[data-ng-repeat='item in itemList']"));
		
		System.out.println("autosuggestions="+autoSuggestion.size());
		
		List<String> actualOrder = new ArrayList<String>();
		
		for(WebElement ele:autoSuggestion) {
			actualOrder.add(ele.getText());
			
		}
		
		List<String> expectedOrder = new ArrayList<String>(actualOrder);
	Collections.sort(expectedOrder);
	System.out.println(actualOrder);
	System.out.println(expectedOrder);
	if(actualOrder.equals(expectedOrder)) {
		System.out.println("Pass:: Eelements are Present in the Alphabetical Order");
	} else {
		System.out.println("Fail:: Elements are Not Present in the Alphabetical Order");
	}
	driver.quit();
	
	}
}

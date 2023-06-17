package multipleelements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmptyList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allElements = driver.findElements(By.tagName("VIRAT"));
		
		for(WebElement ele:allElements) {
			System.out.println(ele.getText());
		}
		System.out.println("All Elements Count is "+allElements.size());
		System.out.println(allElements.isEmpty());
		System.out.println(allElements);
		driver.quit();
	}
}

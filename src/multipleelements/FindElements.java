package multipleelements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		List<WebElement> allLinksList = driver.findElements(By.tagName("a"));
		
		for(WebElement ele:allLinksList) {
			if(ele.isDisplayed()) {
				System.out.println(ele.getText());
			}
		}
			System.out.println("Total Links Count="+allLinksList.size());
			driver.quit();
		}
	}


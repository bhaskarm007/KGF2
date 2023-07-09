package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMyExpecetedConditions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//		wait.until(MyExpectedConditions.MyTitleIs("Mahi.."));
		wait.until(MyExpectedConditions.PageSourceContainsText("Google offered in: "));
		
	}

}

package synchronization;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Was to Verify if the Applications loads within 2 Seconds
public class PageLoadTimeOut {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	
	try {
		driver.get("https://demo.actitime.com");
		System.out.println("Pass:: Application Loaded within 2 Seconds");
	} catch (TimeoutException e) {
		System.out.println("Fail:: Application Not Loaded within 2 Seconds");
	}
  }
}

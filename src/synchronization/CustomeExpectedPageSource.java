package synchronization;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomeExpectedPageSource {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	try {
		wait.until(new PageSourceContainsText("OrangeHRM OS 5.4")); // it will changes when application updated
		System.out.println("PASS");
	} catch (TimeoutException e) {
		System.out.println(e.getMessage());
		System.out.println("FAIL");
	}
}
}

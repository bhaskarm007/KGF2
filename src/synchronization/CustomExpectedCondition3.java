package synchronization;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//Program is Dependent on "MyCondition3"
public class CustomExpectedCondition3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	try {
		wait.until(new MyCondition3("Mahi.."));//Title is Not Mahi.., so it goes to catch block
		System.out.println("PASS");
	} catch (TimeoutException e) {
		System.out.println(e.getMessage());
		System.out.println("FAIL");
	}
}
}

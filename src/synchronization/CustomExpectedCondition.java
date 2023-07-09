package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//This program is Dependent on the "MyCondition" Program...
public class CustomExpectedCondition {
public static void main(String[] args) {
	
	System.setProperty("webdrive.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
    
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
	wait.until(new MyCondition());
	
	System.out.println("PASS");
}
}  

package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to modify Url w/o using get() and navigate().to()

public class ModifyUrlWithoutusing {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.com");
	
	String url = "https://www.facebook.com";
    JavascriptExecutor jse=(JavascriptExecutor) driver;
    jse.executeScript("location.href=arguments[0]", url);
   }

}

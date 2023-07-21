package actionsclass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// WAS to Scroll Up and Scroll Down using Actions class
public class ScrollUpScrollDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.oracle.com/in/");
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.END,Keys.PAGE_DOWN).perform();
	
	Thread.sleep(5000);
	action.sendKeys(Keys.HOME, Keys.PAGE_UP).perform();
	
}
}

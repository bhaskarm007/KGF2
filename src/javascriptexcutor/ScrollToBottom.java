package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to scroll to bottom of web page and scrollback to top
public class ScrollToBottom {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com");
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("scrollTo(0, document.body.scrollHeight)");
	
	Thread.sleep(10000);
	jse.executeScript("scrollTo(0, -document.body.scrollHeight)");
	
}
}

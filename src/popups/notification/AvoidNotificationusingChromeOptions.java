package popups.notification;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Program to Avoid Notification PopUp in Chrome using ChromeOptions class
// Program to Open Chrome Browser in Headless Mode
public class AvoidNotificationusingChromeOptions {
	
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	
	ChromeOptions options = new ChromeOptions();
	
// List of Chromium Command Line Switches (CLI flags).
//  this keywords from Specific Browser not a  java keywords.******	
// 	https://peter.sh/experiments/chromium-command-line-switches/
	
	options.addArguments("--disable-notifications");

// If you want to see WebSite Operation comment it this line 
	options.addArguments("--headless");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("nameishemanth105@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Testing@123");
	driver.findElement(By.name("login")).click();
	
// headless mode login TakeScreenshot webpage
	
//	TakesScreenshot ts= (TakesScreenshot)driver;
//	File tempFile = ts.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(tempFile, new File("loginPage"));
	
}
}

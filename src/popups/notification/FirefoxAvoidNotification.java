package popups.notification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

// Program to Avoid Notification Popup in Firefox using firefoxOptions class
// Program to Open Firefox Browser in Headless Mode

public class FirefoxAvoidNotification {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
// To see CLI flags in Firefox
// Open Firefox --> type search bar --> about:config --> accept Risk -->Show All.
//  about:config --> this is address link
	
	FirefoxOptions options = new  FirefoxOptions();
	options.addPreference("dom.webnotifications.enabled", false);
// if you want browsing operations, then this below line Comment it...	
	options.addArguments("--headless");
	WebDriver driver = new FirefoxDriver(options);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("nameishemanth105@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Testing@123");
	driver.findElement(By.name("login")).click();
}
	
}

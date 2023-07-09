package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to Click on a Button using Javascript

public class ClickOnButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demo.actitime.com");

// 1. Identify target element using findElement();	
	WebElement loginButton = driver.findElement(By.id("loginButton"));

// 2. Downcast WebDriver to JavascriptExecutor	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
// 3. Call executeScriptMethod and supply the target WebElement as a Second Argument
// 4. Use the target WebElement within the script using arguments array Variable and call click()	
	jse.executeScript("arguments[0].click();", loginButton);
}
}

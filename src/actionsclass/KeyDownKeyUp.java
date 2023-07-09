package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Program to perform CONTROL + CLICK Operation to open the links in New Tab

public class KeyDownKeyUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://dipr.karnataka.gov.in/english");
	
	WebElement donateLink = driver.findElement(By.linkText("Sign In"));
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL).click(donateLink).keyUp(Keys.CONTROL).perform();
}
}

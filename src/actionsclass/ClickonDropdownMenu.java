package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Program to click on elements within the Drop Down Menu
public class ClickonDropdownMenu {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	
	WebElement kidsMenu = driver.findElement(By.linkText("KIDS"));
	Actions actions = new Actions(driver);
	actions.moveToElement(kidsMenu).perform();
	driver.findElement(By.linkText("Sunglasses")).click();
}	
}

package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Make sure the target element is available in the web page before using perform() method
// Otherwise while storing the action using that WebElement we may get NoSuchElementException
// Here Only when we mouse hover on KIDS menu "Sunglasses" link will be loaded & displayed
// But Mouse Hovering will happen only when perform() method is called

public class BeforeUsingPerformMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com");
	
	WebElement kidsMenu = driver.findElement(By.linkText("KIDS"));
	Actions action = new Actions(driver);
	
	action.moveToElement(kidsMenu);
	
	action.click(driver.findElement(By.linkText("Sunglasses"))); // NoSuchElementExeception is thrown here
    
	action.perform();
}
}

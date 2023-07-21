package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Program to Click on the particular co-ordinates of the target WebElement
public class CoOridinatesOfTargetElement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://karnatakatourism.org/");
	
	WebElement developersLink = driver.findElement(By.xpath("//span[text()='Destinations']"));
	Actions action=new Actions(driver);
	action.moveToElement(developersLink, -100, 0).click().perform();
// Hear clicking previous link 	
}
}

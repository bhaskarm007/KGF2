package actionsclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Program to perform CONTROL + CLICK on All Menu Links
public class ControlClickOnMenuLinks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	
	List<WebElement> menuLinkList = driver.findElements(By.xpath("//div[@id='nav-xshop']//a[@class='nav-a  ']"));
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL);
	for (WebElement ele : menuLinkList) {
		action.click(ele);
	}
	action.keyUp(Keys.CONTROL);
	action.perform();
	
//	driver.quit();
}
}

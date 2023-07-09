package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Program to doubleclick() on the target WebElemet
public class DoubleClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://artoftesting.com/samplesiteforselenium");
    
    WebElement doubleClickButton = driver.findElement(By.id("dblClkBtn"));
    Actions actions= new Actions(driver);
    actions.doubleClick(doubleClickButton).perform();
}
}

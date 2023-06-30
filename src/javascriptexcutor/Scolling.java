package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//***=> Was to Click on a link which will be loaded After Scrolling

public class Scolling {
public static void main(String[] args) {
	System.setProperty("webdirver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://www.google.com/doodles");
    
    for (;;) {
		try {
			driver.findElement(By.linkText("Children's Day 2021 (October 1)")).click();
	        break;
		} catch (NoSuchElementException e) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("scrollBy(0, 1000);");
		}
	}
    
    String expectedUrlFraction = "childrens-day-2021-october-1";
    String actualUrl = driver.getCurrentUrl();
    
    System.out.println("expectedUrlFraction="+expectedUrlFraction);
    System.out.println("actualUrl="+ actualUrl);
    
    try {
		wait.until(ExpectedConditions.urlContains(expectedUrlFraction));
		System.out.println("Pass:: Children's Day Page Loaded");
	} catch (TimeoutException e) {
		System.out.println("Fail:: Children's Day Page is Not Loaded");
	}
    //driver.quit();
    
}
}

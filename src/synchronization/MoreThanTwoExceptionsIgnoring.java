package synchronization;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoreThanTwoExceptionsIgnoring {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.pollingEvery(Duration.ofSeconds(1));
	
	List list=new ArrayList();
	list.add(StaleElementReferenceException.class);
    list.add(NoSuchSessionException.class);
    list.add(IllegalArgumentException.class);
    
    wait.ignoreAll(list);
    
    driver.get("https://demo.actitime.com");
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    
    WebElement loginButton = driver.findElement(By.id("loginButton"));
    loginButton.click();
    
    driver.quit();
    
//    wait.until(ExpectedConditions.visibilityOf(loginButton));
    
}
}

package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

// Program to Avoid ElementClickInterceptedException
public class AvoidElementClickInterceptedException {
 public static void main(String[] args) {
	  
	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demo.actitime.com");
     
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.name("pwd")).sendKeys("manager");
     driver.findElement(By.id("loginButton")).click();
     
     WebElement logoutLink = driver.findElement(By.id("logoutLink"));
     JavascriptExecutor jse = (JavascriptExecutor) driver;
     jse.executeScript("arguments[0].click();", logoutLink);
 }
}

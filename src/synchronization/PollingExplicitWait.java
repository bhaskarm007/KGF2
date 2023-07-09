package synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PollingExplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
		
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		// Intensely written the wrong hear Title name
		wait.until(ExpectedConditions.titleIs("actiTIME - Mahi Time-Track")); 
	}
}    
//
//pollingPeriod to see in the console tab error (2000 milliseconds)

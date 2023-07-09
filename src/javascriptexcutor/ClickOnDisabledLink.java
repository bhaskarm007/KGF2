package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to click on a disabled element

public class ClickOnDisabledLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
	
	driver.findElement(By.linkText("jdk-8u202-linux-x64.rpm")).click();
	WebElement disableLink = driver.findElement(By.linkText("Download jdk-8u202-linux-x64.rpm"));

//DownCast to driver to JavascriptExecutor	 
	JavascriptExecutor jse= (JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", disableLink);
}
	
}

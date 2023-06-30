package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Program to understand how to use executeScript method with jsCode.

public class CreatingPopUp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("alert('Happy Dasara!!!');");
}
}
//NOTE:: We will never create a alert popup in Automation. This is just a demo code to understand executescript method
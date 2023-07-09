package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to enter text into Textfield using Javascript
public class EnterTextTextField {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com");
	
// creating String to send a value.	
	String usernameData="admin";
	WebElement usernameTextField = driver.findElement(By.id("username"));
	JavascriptExecutor jse= (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].vlaue=arguments[1];", usernameTextField,usernameData);	

	}
}

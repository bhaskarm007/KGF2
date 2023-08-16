package staleelementreferenceexception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to understand why we get StaleElementReferenceException

public class GetException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		driver.navigate().refresh();
		usernameTextField.sendKeys("Mahibh");
		

	}

}

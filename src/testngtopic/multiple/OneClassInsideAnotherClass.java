package testngtopic.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Script to understand How to use One Class @DataProvider inside another class
public class OneClassInsideAnotherClass {
//
	@Test(dataProviderClass = ParallelExecution.class, dataProvider = "credentials")
	public void testMultipleLogins(String userData, String passwordData) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys(userData);
		driver.findElement(By.name("pwd")).sendKeys(passwordData);
	}
	
}

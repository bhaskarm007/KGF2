package testngtopic.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Script to run multiple time same test case with multiple test data

public class MultipleTimeSameTest {
	
	@DataProvider
	public String[] getData() {
		String[] usernames = {"admin", "admin123", "admin786"};
		return usernames;
	}

	@Test(dataProvider = "getData")
	public void testLogin(String userData) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys(userData);
	}
}

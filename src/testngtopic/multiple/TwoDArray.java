package testngtopic.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Script to understand 2D Array
public class TwoDArray {

	@DataProvider(name="credentials")
	public String[][] testData() {
		String[][] sarr = {{"admin", "manager"}, {"trainee", "trainee"},{"mahi", "mahibh007"}};
		return sarr;
	}
	@Test(dataProvider = "credentials")
	public void testMultipleLogins(String userData,String passwordData) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.name("pwd")).sendKeys(passwordData);
	}
}

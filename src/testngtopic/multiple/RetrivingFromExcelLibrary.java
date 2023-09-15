package testngtopic.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import datadriventesting.excel.ExcelLibrary;

// Script to understand Retrieving data from ExcelLibrary
public class RetrivingFromExcelLibrary {

	@DataProvider(name="credentials")
	public String[][] testData() {
		return ExcelLibrary.getMulitpleData("Multiple");
	}
	
	@Test(dataProvider = "credentials")
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

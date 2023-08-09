package datadriventesting.excel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Using the ExcelLibrary methods to read test data

public class ExcelLibraryMainLogin {
 
	public static void main(String[] args) {
		
		String sheetName = "TC001";
		
		String url = ExcelLibrary.getStringData(sheetName, 1, 0);
		String usernameData = ExcelLibrary.getStringData(sheetName, 1, 1);
		String passwordData = ExcelLibrary.getStringData(sheetName, 1, 2);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(usernameData);
		driver.findElement(By.name("pwd")).sendKeys(passwordData);
		
	}
}
//Always store the excel sheet data file inside selenium workspace
//hear folder name:- resources --> sheet file name-->testdata--> under sheet names--> (sheet1)TC001.
//Excel sheet data
/*
     url	                       ||username ||password
https://demo.actitime.com/login.do || admin   ||manager

 */
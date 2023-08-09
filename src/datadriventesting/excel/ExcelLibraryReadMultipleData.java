package datadriventesting.excel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Using the ExcelLibrary methods to read Multiple test data

public class ExcelLibraryReadMultipleData {
 
	public static void main(String[] args) {
		
		String[][] sarr = ExcelLibrary.getMulitpleData("Multiple");
		
		for(int i=0;i<=sarr.length-1;i++) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://demo.actitime.com");
			driver.findElement(By.id("username")).sendKeys(sarr[i][0]);
			driver.findElement(By.name("pwd")).sendKeys(sarr[i][1]);
		}
	}
}
//Always store the excel sheet data file inside selenium workspace
//hear folder name:- resources --> sheet file name-->testdata--> under sheet names--> (sheet3)Multiple.
//Excel data
/*
username	password
admin		manager
trainee		trainee
bhaskar		bhaskar123
bharath		bharath123
mahi		mahi007

*/
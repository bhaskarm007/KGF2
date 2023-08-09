package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to login multiple data

public class MultipleDataLogin {
	
public static void main(String[] args) throws IOException {
	
	String filePath = "./resources/testdata.xlsx";
	
	FileInputStream fin = new FileInputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(fin);
	
	Sheet sheet = workbook.getSheet("Multiple");
	
	int rowCount = sheet.getPhysicalNumberOfRows();
	int cellCount = sheet .getRow(0).getPhysicalNumberOfCells();
	
	System.out.println("rowCount="+rowCount);
	System.out.println("cellCount="+cellCount);
	
	String[][] sarr = new String[rowCount][cellCount];
	
	// Iterate the rows
	for(int i=0;i<=rowCount-1;i++) {
		// Iterate the cells
		for(int j=0;j<=cellCount-1;j++) {
			sarr[i][j] = sheet.getRow(i).getCell(j).toString();
		}
	}
	
	for(int i=0;i<=sarr.length-1;i++) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
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
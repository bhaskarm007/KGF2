package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Script to take data from Excel & print in Excel

public class TestcasefromAndPrintInExcel {
	
public static void main(String[] args) throws IOException {
	
	String pass;
	
	String filePath = "./resources/testcase.xlsx";
	FileInputStream fin = new FileInputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(fin);
	Sheet sheet = workbook.getSheet("TC001");
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com");
	
	String expectedUrl = "https://demo.actitime.com/login.do";
	
	String actualUrl = driver.getCurrentUrl();
	sheet.getRow(1).getCell(4).setCellValue(actualUrl);
	
	System.out.println("expectedUrl="+expectedUrl);
	System.out.println("actualUrl="+actualUrl);
	
	if(actualUrl.equals(expectedUrl)) {
		System.out.println((pass = "PASS")+" :: Login Url is Correct");	
	}else {
		System.out.println((pass = "FAIL")+" :: Login Url is InCorrect");
	}
	
	sheet.getRow(1).getCell(5).setCellValue(pass);
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	String expectedHomeUrl = "https://demo.actitime.com/user/submit_tt.do";
	String actualHomeUrl = "";
	
	try {
		wait.until(ExpectedConditions.urlToBe(expectedHomeUrl));
		actualHomeUrl = driver.getCurrentUrl();
		System.out.println((pass = "PASS")+ " :: Home Page Url is Correct");
	} catch (TimeoutException e) {
		System.out.println((pass ="FAIL")+ " :: Home Page Url is Not Correct");
	}
	
	sheet.getRow(2).getCell(4).setCellValue(actualHomeUrl);
	sheet.getRow(2).getCell(5).setCellValue(pass);
	
	String expectedTitle = "actiTIME - Enter Time-Track";
	String actualTitle = "";
	
	try {
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		actualTitle = driver.getTitle();
		System.out.println((pass= "PASS")+" :: Home Page Title is Correct");
	} catch (TimeoutException e) {
		System.out.println((pass = "FAIL")+" :: Home Page Title is Not Correct");
	}
	sheet.getRow(3).getCell(4).setCellValue(actualTitle);
	sheet.getRow(3).getCell(5).setCellValue(pass);
	
	workbook.write(new FileOutputStream(filePath));
}
}

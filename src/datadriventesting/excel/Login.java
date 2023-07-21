package datadriventesting.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Script to get data from excel sheet and login on webpage
public class Login {
public static void main(String[] args) throws IOException {
	
	String filePath = "./resources/testdata.xlsx";
	
	FileInputStream fin = new FileInputStream(filePath);
	
	Workbook workbook = WorkbookFactory.create(fin);
	
//  object creation	
//	Sheet sheet = workbook.getSheet("TC001");

	String url = workbook.getSheet("TC001").getRow(1).getCell(0).getStringCellValue();
    String usernameData = workbook.getSheet("TC001").getRow(1).getCell(1).getStringCellValue();
    String passwordData = workbook.getSheet("TC001").getRow(1).getCell(2).getStringCellValue();
    
    System.out.println("URL="+url);
    System.out.println("usernameData="+usernameData);
    System.out.println("passwordData="+passwordData);
    
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    driver.get(url);
    driver.findElement(By.id("username")).sendKeys(usernameData);
    driver.findElement(By.name("pwd")).sendKeys(passwordData);
    
}
}

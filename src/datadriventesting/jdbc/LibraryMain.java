package datadriventesting.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to get data from db using DatbaseLibrary
public class LibraryMain {
	
public static void main(String[] args) throws SQLException {
	
	DatabaseLibrary db = new DatabaseLibrary("credentials");
	ResultSet rs = db.getData("select * from details;");
	
	while(rs.next()) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
		driver.findElement(By.name("pwd")).sendKeys(rs.getString("password"));
		
	}
	
   }
}

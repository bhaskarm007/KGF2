package datadriventesting.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Opening series of credentials to login webpage.
public class LoginUsingDataMySql {

	public static void main(String[] args) throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/credentials";
        String dbUsername = "root";
        String dbPassword = "root";
        
        Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        
        Statement stmt = con.createStatement();
        
        String sqlQuery = "select * from details;";
         
        ResultSet rs = stmt.executeQuery(sqlQuery);
        
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
// mySql data
/*
 create database credentials;
create table details (username varchar(20), password varchar(20));
insert into details values('admin', 'manager');
insert into details values('trainee', 'trainee');
insert into details values('hemanth', 'hemanth123');
insert into details values('karna', 'karna123');
insert into details values('mahibh', 'mahi007');
select * from details;

 */
 
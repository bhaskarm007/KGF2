package extentreports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

// Script to understand ExtentReports topic
public class Tester1 {

	public static void main(String[] args) {
		 ExtentReports extentReports = new ExtentReports();
		 ExtentSparkReporter spark = new ExtentSparkReporter("./extentReports/report.html");
		 extentReports.attachReporter(spark);
		 ExtentTest extentTest = extentReports.createTest("Test to verify Valid Login");
		 
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 extentTest.pass("Chrome Browser Launched");
		 driver.manage().window().maximize();
		 extentTest.pass("Chrome Browser Maximized");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 extentTest.pass("Applied Implicit Wait");
		 extentTest.pass("Launched App Url");
		 
		 driver.findElement(By.id("username")).sendKeys("admin");
		 extentTest.pass("Entered Username");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 extentTest.pass("Entered Password");
		 driver.findElement(By.id("loginButton")).click();
		 extentTest.pass("Clicked On LoginButton");
		 
		 extentReports.flush();
		 
	}
}

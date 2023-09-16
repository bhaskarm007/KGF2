package extentreports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

// Script to understand ExtentReports concept @BeforeClass and @AfterClass
public class BaseTest {
 
	ExtentReports extentReports;
	ExtentTest extenTest;
	public WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void createReport(@Optional("chrome") String browserName) {
		extentReports = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./extentReports/"+browserName+".html");
		extentReports.attachReporter(spark);
	}
	
	@Parameters({"appUrl", "browserName", "username", "password"})
	@BeforeClass
	public void launchApp(@Optional("https://demo.actitime.com") String appUrl,
			              @Optional("chrome") String browserName,
			              @Optional("admin") String username,
			              @Optional("manager") String password) throws InterruptedException {
		 
		 if (browserName.equalsIgnoreCase("chrome")) {
	        	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        	driver = new ChromeDriver();
	        	
	        } else if(browserName.equalsIgnoreCase("firefox")) {
	        	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	        	driver = new FirefoxDriver();
	        	
	        } else {
	        	Assert.fail("Only 2 Browsers Supported");
		    }
		 
		    driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get(appUrl);
	        driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(5000);
			
	}
	
	@AfterClass
	public void closeApp() {
       ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.id("logoutLink")));
		
		driver.quit();
	}
	
	@AfterTest
	public void flushReport() {
		extentReports.flush();
	}
}

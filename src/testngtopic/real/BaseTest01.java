package testngtopic.real;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

// Script to understand BaseTest for @BeforeClass & @AfterClass 
public class BaseTest01 {

	public WebDriver driver;
	
	@Parameters({"appUrl", "browserName"})
	@BeforeClass
	public void launchApp(@Optional ("https://demo.actitime.com/") String appUrl,
	                      @Optional("chrome") String browserName) {
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
    }
	
	@Parameters({"username","password"})
	@BeforeMethod
	public void login(@Optional("admin") String username,
			          @Optional("manager") String password) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
	}
	 
	@AfterMethod 
	public void logout() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.id("logoutLink")));
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}

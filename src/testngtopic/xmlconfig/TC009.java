package testngtopic.xmlconfig;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Script to understand Parallel Execution
public class TC009 {

	@Parameters({"browserName", "username", "password"})
	@Test
	public void testUsers(@Optional("chrome") String browserName,
			              @Optional("trainee") String username,
			              @Optional("trainee") String password) throws InterruptedException {
		
		WebDriver driver =null;
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			Assert.fail("Only 2 Browsers Supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		
		WebElement reportsLink = driver.findElement(By.linkText("Reports"));
		
		Assert.assertTrue(reportsLink.isDisplayed(),"Reports link is Not Displayed");
		Assert.assertEquals(reportsLink.getText(),"Reports","Reports Link Text is Not Correct");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", reportsLink);
		
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Reports Dashboard", "Reports Page Title is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/reports/reports.do", "Reports Page Url is Not Correct");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.id("logoutLink")));
		
		driver.quit();
			}
}

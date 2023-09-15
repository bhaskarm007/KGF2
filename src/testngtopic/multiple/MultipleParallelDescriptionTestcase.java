package testngtopic.multiple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

// Script to understand Multiple, Parallel, Description of Test case Execution
public class MultipleParallelDescriptionTestcase {

	@Test(description ="Login With Valid Credentials and Verify Logout Link is Displayed", invocationCount = 2,threadPoolSize = 2)
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Assert.assertTrue(driver.findElement(By.id("logoutLink")).isDisplayed(),"Logout Link is Not Displayed");
	}
}

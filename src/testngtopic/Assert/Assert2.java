package testngtopic.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Script to understand Assert
public class Assert2 {

	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
//		Thread.sleep(10000);
		
//		List<WebElement> allTags = driver.findElements(By.tagName("MAHI"));
		
//		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track", "Home Page is Not Displayed");
//		Assert.assertEquals(allTags.isEmpty(), false,"The List of TageNames With MAHI is Not Displayed");
		
//		Assert.assertTrue(allTags.isEmpty(), "It is Not Empty");
//		Assert.assertFalse(allTags.isEmpty(),"It is Empty");
		
//		Assert.fail();
		
		Assert.fail("Sorry Darling...!");
	}
	
}

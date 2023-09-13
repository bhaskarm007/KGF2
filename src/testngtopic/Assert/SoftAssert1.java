package testngtopic.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//Script to understand SoftAssert
public class SoftAssert1 {

	@Test
	public void testLogin() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(driver.findElement(By.id("username")).isEnabled());
		sa.assertFalse(driver.findElement(By.name("pwd")).isEnabled(),"Password Field is Not Disabled");
//		sa.assertAll();
		sa.assertTrue(driver.findElement(By.id("keepLoggedInCheckBox")).isSelected(), "Remember CheckBox is Not Selected");
		sa.assertTrue(driver.findElement(By.id("loginButton")).isEnabled());
		driver.findElement(By.id("loginButton")).click();
		
		sa.assertAll();
	}
}

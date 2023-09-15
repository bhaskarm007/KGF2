package testngtopic.real;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

// Script to understand Run the TestCase throw the .xml file and dependent on BaseTest Script
public class TC001TestReports extends BaseTest {

	@Test
	public void testReports() throws InterruptedException  {
        WebElement reportsLink = driver.findElement(By.linkText("Reports"));
		
		Assert.assertTrue(reportsLink.isDisplayed(),"Reports link is Not Displayed");
		Assert.assertEquals(reportsLink.getText(),"Reports","Reports Link Text is Not Correct");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", reportsLink);
		
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Reports Dashboard", "Reports Page Title is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/reports/reports.do", 
																				"Reports Page Url is Not Correct");
	}
}

package testngtopic.real;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

// Script to understand real time testScripts to run the extends the BaseTest02
// throw the .xml file
public class TC003TestUsersAndReports extends BaseTest02{

	@Test
	public void testReports() throws InterruptedException {
WebElement reportsLink = driver.findElement(By.linkText("Reports"));
		
		Assert.assertTrue(reportsLink.isDisplayed(),"Reports link is Not Displayed");
		Assert.assertEquals(reportsLink.getText(),"Reports","Reports Link Text is Not Correct");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", reportsLink);
		
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Reports Dashboard", "Reports Page Title is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/reports/reports.do", 
																				"Reports Page Url is Not Correct");
	}
	@Test
	public void testUsers() throws InterruptedException {
		WebElement usersLink = driver.findElement(By.linkText("Users"));
		
		Assert.assertTrue(usersLink.isDisplayed(),"Users link is Not Displayed");
		Assert.assertEquals(usersLink.getText(),"Users","Users Link Text is Not Correct");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", usersLink);
		
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - User List", "Users Page Title is Not Correct");
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/administration/userlist.do", 
																					"Users Page Url is Not Correct");
     }
}

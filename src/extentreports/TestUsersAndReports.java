package extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestUsersAndReports extends BaseTest {

	@Test
	public void testReports() throws InterruptedException  {
		extenTest = extentReports.createTest("Verify Reports Module");
		
        WebElement reportsLink = driver.findElement(By.linkText("Reports"));
        extenTest.pass("Reports Link Found");
        
		Assert.assertTrue(reportsLink.isDisplayed(),"Reports link is Not Displayed");
		extenTest.pass("Reports Link is Displayed");
		
		Assert.assertEquals(reportsLink.getText(),"Reports","Reports Link Text is Not Correct");
		extenTest.pass("Reports Link Text is Correct");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", reportsLink);
		extenTest.pass("Clicked on Reports Link");
		
		Thread.sleep(5000);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Reports Dashboard", "Reports Page Title is Not Correct");
		extenTest.pass("Reports Page Title is Correct");
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/reports/reports.do", 
																				"Reports Page Url is Not Correct");
		extenTest.pass("Reports Page Url is Correct");
	}
	
	public class TC002TestUsers extends BaseTest {
		
		@Test
		public void testUsers() throws InterruptedException {
			extenTest = extentReports.createTest("Verify Users Module");
			
			WebElement usersLink = driver.findElement(By.linkText("Users"));
			extenTest.pass("Users Link Found");
			
			Assert.assertTrue(usersLink.isDisplayed(),"Users link is Not Displayed");
			extenTest.pass("Users Link is Displayed");
			
			Assert.assertEquals(usersLink.getText(),"Users","Users Link Text is Not Correct");
			extenTest.pass("Users Link Text is Correct");
			
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", usersLink);
			extenTest.pass("Clicked on Users Link");
			
			Thread.sleep(5000);
			
			Assert.assertEquals(driver.getTitle(), "actiTIME - User List", "Users Page Title is Not Correct");
			extenTest.pass("Users Page Title is Correct");
			
			Assert.assertEquals(driver.getCurrentUrl(), "https://demo.actitime.com/administration/userlist.do", 
																				"Users Page Url is Not Correct");
			extenTest.pass("Users Page Url is Correct");
		}
}

}

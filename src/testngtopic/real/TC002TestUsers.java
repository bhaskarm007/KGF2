package testngtopic.real;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002TestUsers extends BaseTest {
	
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

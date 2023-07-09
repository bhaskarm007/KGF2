package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
//Script to create a Custom Expected Condition using Anonymous Inner Class
public class ExpectedConditionUsingAnnonymous {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	wait.until(new ExpectedCondition<Boolean>(){
		public Boolean apply(WebDriver driver) {
			return driver.getTitle().equals("Mahi..");
		}
		@Override
			public String toString() {
				
				return "Sorry, title is not Mahi..";
			}
	});
}
}

package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Program to Select the DOB(Date Of Birth).
public class DOBSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		Select daySelect = new Select(driver.findElement(By.id("day")));
		Select monthSel=new Select(driver.findElement(By.id("month")));
		Select yearSel= new Select(driver.findElement(By.id("year")));
		
		daySelect.selectByVisibleText("17");
		monthSel.selectByVisibleText("Jun");
		yearSel.selectByVisibleText("1998");
		
	}
}

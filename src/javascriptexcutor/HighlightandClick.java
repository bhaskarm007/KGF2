package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightandClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/");
	
	LibraryClass.higlightedAndClick(driver, driver.findElement(By.cssSelector("a[id='login_Layer']")));
	driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("nameishemanth@rediffmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Testing@123");
	LibraryClass.higlightedAndClick(driver, driver.findElement(By.xpath("//button[text()='Login']")));
	LibraryClass.higlightedAndClick(driver, driver.findElement(By.linkText("Complete profile")));
	
}
}

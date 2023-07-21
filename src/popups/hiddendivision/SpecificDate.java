package popups.hiddendivision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to Select a Specific date		
public class SpecificDate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.xpath("//div[contains(@class,'homeCalender')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='July 2023']/../..//div[text()='23']")).click();
		
	}
}

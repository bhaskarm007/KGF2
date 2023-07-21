package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// program to click on an element within a frame using WebElement version

public class WebEelementVer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zoho.com/crm/features.html");
		
		driver.findElement(By.id("zsiq_agtpic")).click();
		
//      driver.switchTo().frame("siqiframe").findElement(By.id("visname")).sendKeys("Mahi..");
        
		driver.switchTo().frame(driver.findElement(By.id("siqiframe"))).findElement(By.id("visname")).sendKeys("Mahi..");
	}
}

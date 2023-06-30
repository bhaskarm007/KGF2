package handlingchildelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 //Script to Handle Form Elements
public class HandlingForms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement regForm = driver.findElement(By.id("reg"));

		regForm.findElement(By.name("firstname")).sendKeys("Mahi");
		regForm.findElement(By.name("lastname")).sendKeys("Shivaa");
		regForm.findElement(By.name("reg_email__")).sendKeys("000003333");
	}

} 

package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to Send an Email
public class ScriptToSendMail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("nameishemanth@rediffmail.com");
		driver.findElement(By.xpath("//label[text()='Subject:']/following-sibling::input"))
		                                          .sendKeys("Testing From Selenium on going");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'rdMailEditorcmp')]")))
		                                                  .findElement(By.xpath("//body[contains(@class,'cke_editable_themed')]"))
		                                                        .sendKeys("Selenium Class Practice is on going...");
		
		driver.switchTo().defaultContent().findElement(By.linkText("Send")).click();
//		driver.switchTo().parentFrame().findElement(By.linkText("Send")).click();
	}
}

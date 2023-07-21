package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// Program to Custom Scroll Bar
public class CustomScrollBar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
		
//	Opening Calendar menu
		driver.findElement(By.id("BE_flight_origin_date")).click();
//		Thread.sleep(5000);
		
//  Bringing the Focus to calendar Menu.		
		driver.findElement(By.className("inActiveTD")).click();
//	Thread.sleep(5000);
		
		Actions action=new Actions(driver);
//    Scrolling the Custom Scroll Bar.		
		action.sendKeys(Keys.PAGE_DOWN).perform();
	}
}

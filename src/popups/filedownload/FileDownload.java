package popups.filedownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// Script to Understand (Firefox)
public class FileDownload {
public static void main(String[] args) throws AWTException, InterruptedException {
	 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	 driver.get("https://www.selenium.dev/downloads/");
	 
//	 driver.get("https://demo.automationtesting.in/FileDownload.html");	 
	 
	 driver.findElement(By.xpath("//p[text()='Java']/..//a[text()='4.10.0 (June 07, 2023)']")).click();
	
//	 driver.findElement(By.id("textbox")).sendKeys("Arjun Reddy");
//	 driver.findElement(By.id("createTxt")).click();
//	 driver.findElement(By.id("link-to-download")).click();

	 
// Website is updated it's working but there direct link will be there without notifying file will be downloading
// if you want to see this operation then you install older version Firefox browser on your system.	 
	 Robot robot = new Robot();
	 
	 robot.keyPress(KeyEvent.VK_ALT);
	 robot.keyPress(KeyEvent.VK_S);
	 
	 robot.keyRelease(KeyEvent.VK_ALT);
	 robot.keyRelease(KeyEvent.VK_S);
	 
	 Thread.sleep(5000);
	 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 
}
}

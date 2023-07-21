package popups.print;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
// Script to print on Internet Explorer 
public class PrintPopUp {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com");
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_P);
	Thread.sleep(3000);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_P);
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_SHIFT);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(3000);
	
	robot.keyRelease(KeyEvent.VK_SHIFT);
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}

}

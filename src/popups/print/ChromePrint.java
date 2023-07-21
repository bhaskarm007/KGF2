package popups.print;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
// Script to runs in chrome driver
public class ChromePrint {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//  System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");	
	WebDriver driver = new ChromeDriver();
//	WebDriver driver = new OperaDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com");
	
	Robot robot = new Robot();

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_P);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_P);
	Thread.sleep(5000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	System.out.println(driver.getWindowHandles().size());
	
// We can't inspect present chrome version...
/*	
	wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	
	driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
	
// First Shadow Host and Shadow Root
	WebElement shadowHost = driver.findElement(By.tagName("print-preview-app"));
    if (shadowHost.isDisplayed()) {
		System.out.println("Pass:: Print Window is Displayed");
	} else {
        System.out.println("Fail:: Print Window is Not Displayed");
	}	
    SearchContext shadowRoot= shadowHost.getShadowRoot();
    
// Second Shadow Host and Shadow Root
    WebElement childShadowHost = shadowRoot.findElement(By.id("sidebar"));
    SearchContext childShadowRoot = childShadowHost.getShadowRoot();
    
// Third Shadow Host and Shadow Root
    WebElement grandchildShadowHost = childShadowRoot.findElement(By.cssSelector("print-preview-button-strip"));
	SearchContext grandShadowRoot = grandchildShadowHost.getShadowRoot();
	
// Clicking on target Element within the Third ShadowRoot
	grandShadowRoot.findElement(By.cssSelector("cr-button[class='action-button']")).click();
	
*/
}
}

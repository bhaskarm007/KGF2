package popups.jspopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Script to Understand Prompt Popup
public class ProomptPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdirver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("file:///E:/seleniumjavascript/Prompt%20Popup.html");
	wait.until(ExpectedConditions.alertIsPresent());
	
	Thread.sleep(5000);
	
	Alert alert = driver.switchTo().alert();
	
	String expectedAlertText = "Enter Your age";
	String actualAlertText = alert.getText();	
	
	System.out.println("expectedAlertText="+expectedAlertText);
	System.out.println("actualAlertText="+actualAlertText);
	
	if (actualAlertText.equals(expectedAlertText)) {
		System.out.println("Pass:: Text is Correct");
	} else {
		System.out.println("Fail:: Text is InCorrect");
	}
	
	alert.sendKeys("26");
	alert.accept();
//	alert.dismiss();
}
}
/*html code
 
 <html lang="en">
 <head>
  
  <title>Alert Example</title>
  <script>
  let age =prompt("Enter Your age");
  console.log("Your Age is " + age);
  </script>
 </head>
</html>

  */


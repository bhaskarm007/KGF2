package popups.jspopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Script to Understand Confiramation Popup
public class ConfirmationPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("file:///E:/seleniumjavascript/Confirmation.html");

	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert= driver.switchTo().alert();
	
	String expectedAlertText = "Do you want in new Tab?";
	String actualAlertText = alert.getText();
	
	System.out.println("expectedAlertText="+expectedAlertText);
	System.out.println("actualAlertText="+actualAlertText);
	
	if (actualAlertText.equals(expectedAlertText)) {
		System.out.println("Pass:: Alert Text is Correct");
	} else {
System.out.println("Fail:: Alert Text is InCorrect");
	}
	alert.dismiss();
	
}
}

// html code
/*<html lang="en">
 <head>
  
  <title>Alert Example</title>
  <script>confirm("Do you want in new Tab?");</script>
 </head>
 
</html>
  
  
 */
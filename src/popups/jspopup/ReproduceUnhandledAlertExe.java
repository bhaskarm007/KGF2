package popups.jspopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to reproduce UnhandledAlertException

public class ReproduceUnhandledAlertExe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///E:/seleniumjavascript/Prompt%20Popup.html");
		
		driver.manage().window().maximize();
	}
}
// html code
/*
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

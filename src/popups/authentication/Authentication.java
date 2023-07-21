package popups.authentication;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Program to handle Authentication PopUp using AutoIT Script
public class Authentication {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://the-internet.herokuapp.com/basic_auth");
	
	Runtime.getRuntime().exec("E:\\AutoIT Script\\AuthenticationScript.exe");
}
}
// File name should be:  "E:\AutoIT Script\AuthenticationScript.au3"
/* this is AutoIT code
Sleep(5000)
Send("admin")
Sleep(5000)
Send("{TAB}")
Sleep(5000)
Send("admin")
Send("{ENTER}")
*/
package popups.print;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to handle Security Warning 

public class SecurityWarning {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.selenium.dev/downloads/");
	
	driver.findElement(By.linkText("4.10.0")).click();
	
	Runtime.getRuntime().exec("E:\\AutoIT Script\\SecurityScript.exe");
	
   }	
}
// C:\ProgramData\Microsoft\Windows\Start Menu\Programs\AutoIt v3
// AutoIt code
/*
Sleep(5000)
Send("{TAB 55}")
Sleep(5000)
Send("{ENTER}")
*/
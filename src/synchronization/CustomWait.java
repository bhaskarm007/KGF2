package synchronization;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//IQ**:: How do you login and logout from the application without using
//      1) Implicit Wait
//      2) Explicit Wait (WebDriverWait, FluentWait) and
//      3) Thread.sleep()

// Answer:: We should use Custom Wait (Waiting using for loop and try catch block)
public class CustomWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	//Custom Wait Logic to wait for Logout link
	
	for(int i=1;i<=100;i++) {
		System.out.println("Try Number="+i);
		try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		} catch (NoSuchElementException e) {
			
		}
	}
}
}

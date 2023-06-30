package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTagNameLibrary {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		
		String usernameData = "admin";
		String passwordData = "manager";
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		usernameTextField.sendKeys(usernameData);
		passwordTextField.sendKeys(passwordData);
		
		if(LibraryClass.verifyEnterdText(usernameTextField, usernameData)) {
			System.out.println("Pass:: usernameData Entered properly");
		} else {
			System.out.println("Fail:: usernameData Not Entered properly");
		}
		if(LibraryClass.verifyEnterdText(passwordTextField, passwordData)) {
			System.out.println("Pass::  passwordData Entered properly");
		} else {
			System.out.println("Fail:: passwordData Not Entered properly");
	}
		//driver.quit();
}} 


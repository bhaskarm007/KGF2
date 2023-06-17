package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsdisplayedGitHub {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/signup");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement passwordField = driver.findElement(By.id("password"));
		if(!passwordField.isDisplayed()) {
			System.out.println("Pass::  Password is Not Displayed");
		}else {
			System.out.println("Fail:: Password is Displayed");
		}
		
		driver.findElement(By.id("email")).sendKeys("nameisbhaskar@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[data-continue-to='password-container']")).click();
		
		if(passwordField.isDisplayed()) {
			System.out.println("Pass:: Password is Displayed");
		}else {
			System.out.println("Fail:: Password is not Displayed");
		}
		//driver.quit();
	}
}

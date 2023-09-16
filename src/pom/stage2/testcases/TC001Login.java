package pom.stage2.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.stage2.pages.HomePage;
import pom.stage2.pages.LoginPage;

public class TC001Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");

//
		new LoginPage(driver).login("Admin", "admin123");
//		
		new HomePage(driver).logout();
	}
}

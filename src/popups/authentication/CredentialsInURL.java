package popups.authentication;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to avoid Authentication PopUp by injecting credentials in URL
public class CredentialsInURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
// Credential used this path
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

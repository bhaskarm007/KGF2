package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DeleteText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		
		WebElement usernameTextfield = driver.findElement(By.id("username"));
		usernameTextfield.sendKeys("admin");
		usernameTextfield.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		usernameTextfield.sendKeys(Keys.DELETE);
		
	}
}

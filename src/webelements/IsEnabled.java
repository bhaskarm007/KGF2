package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsEnabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/signup");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement containerButton = driver.findElement(By.cssSelector("button[data-continue-to='password-container']"));
		if(!containerButton.isEnabled()) {
			System.out.println("Pass:: Continue Button is Disabled");
		}else {
			System.out.println("Fail :: Continue Button is Enabled");
		}
		driver.findElement(By.id("email")).sendKeys("nameisbhaskar@gmail.com");
		Thread.sleep(2000);
		if(containerButton.isEnabled()) {
			System.out.println("Pass:: Continue Button is Enabled");
		}else {
			System.out.println("Fail:: Continue Button is Disabled");
		}
		//driver.quit();
	}
}

package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SubmitGitHub {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/signup");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		WebElement eamilTextField = driver.findElement(By.id("email"));
		eamilTextField.sendKeys("nameisbhaskar@gmail.com");
		eamilTextField.submit();
		
		//driver.quit();
	}
}

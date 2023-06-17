package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Vc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airtel.in/manage-account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
	}
}

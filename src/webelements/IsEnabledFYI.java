package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsEnabledFYI {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/#jdk20-linux");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("jdk-8u371-linux-aarch64.rpm")).click();
		Thread.sleep(2000);
		if(!driver.findElement(By.linkText("Download jdk-8u371-linux-aarch64.rpm")).isEnabled()) {
			System.out.println("Pass:: link is Disabled");
		}else {
			System.out.println("Fail:: link is Enabled");
		}
		driver.findElement(By.xpath("//input[@name='licenseAccept' and @placeholder]")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.linkText("Download jdk-8u371-linux-aarch64.rpm")).isEnabled()) {
			System.out.println("Pass:: Link is Enabled");
		}else {
			System.out.println("Fail:: Link is Disabled");
		}
		//driver.quit();
	}
}

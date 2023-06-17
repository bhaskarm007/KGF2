package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsEnabledFYI2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("jdk-8u371-linux-aarch64.rpm")).click();
		Thread.sleep(3000);
		WebElement downloadLink = driver.findElement(By.xpath("//a[text()='Download jdk-8u371-linux-aarch64.rpm']/.."));
		
		if(downloadLink.getAttribute("class").contains("disabled")) {
			System.out.println("Pass:: Element is Disabled");
		}else {
			System.out.println("FAIL:: Element is Enabled");
		}
		driver.findElement(By.xpath("//input[@name='licenseAccept' and @placeholder]")).click();
		Thread.sleep(3000);
		if(!downloadLink.getAttribute("class").contains("disabled")) {
			System.out.println("Pass:: Element is Enabled");
		}else {
			System.out.println("Fail:: Element is Disabled");
		}
	}
}

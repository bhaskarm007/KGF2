package popups.fileupload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// Program to Upload a valid file by avoiding file Upload Popup
// To avoid File Upload PopUp we should follow below steps
// 1. Identify the <input type="file"> element related to that Upload button/Browser button/Attach button etc..
// 2. Use sendKeys() with full absolute path of the target file
public class UploadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("nameishemanth105@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Testing@123");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.cssSelector("div[aria-label='Account']")).click();
		driver.findElement(By.xpath("//span[text()='Give feedback']")).click();
		driver.findElement(By.xpath("span[text()='Help us improve the new Facebook']")).click();
		
		String uploadXp ="//div[@aria-label='Add a Screenshot or Video (recommended)']/preceding-sibling::input";
		
		driver.findElement(By.xpath(uploadXp)).sendKeys("C:\\Users\\Lenovo\\Desktop\\Practice\\Alone.jpg");
		
	}

}

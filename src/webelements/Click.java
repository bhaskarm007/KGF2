package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
	    
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		driver.findElement(By.linkText("Full Stack Developer")).click();
	}
}

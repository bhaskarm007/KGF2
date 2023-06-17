package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TopAlignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signin");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[aria-label='Close']")).click();
		Thread.sleep(3000);
		int emailTextFieldStartY = driver.findElement(By.name("email")).getLocation().getY();
		int passwordTextFieldStartY = driver.findElement(By.name("pass")).getLocation().getY();
		
		System.out.println("usernameTextFieldStartY="+emailTextFieldStartY);
		System.out.println("passwordTextFieldStartY="+passwordTextFieldStartY);
		
		if(emailTextFieldStartY==passwordTextFieldStartY) {
			System.out.println("Pass:: username & password Top Alignment is Correct");
		}else {
			System.out.println("Fail:: username & password Top Alignment is Incorrect");
		}
		//driver.quit();
	}
}

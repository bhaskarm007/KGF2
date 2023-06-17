package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LeftAllignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		int usernameStartX = driver.findElement(By.id("username")).getLocation().getX();
		int passwordStartX = driver.findElement(By.name("pwd")).getLocation().getX();
		
		System.out.println("usernameStartX="+usernameStartX);
		System.out.println("passwordStartX="+passwordStartX);
		
		if(usernameStartX==passwordStartX) {
			System.out.println("Pass:: Left Alignment of the username & password is correct");
		} else {
			System.out.println("Fail:: Left Alignment of the username & password is inCorrect");
		}
		driver.quit();
	}
}

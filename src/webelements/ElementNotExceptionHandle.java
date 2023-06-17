package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ElementNotExceptionHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		try {
			//you should aware of Space Space before/ after text 
		driver.findElement(By.xpath("//div[text()='Login ']")).sendKeys(Keys.ENTER);
		}
		catch(ElementNotInteractableException e) {
			//using surrounding html tag to perform on desired operation
			driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
		}
	}
}

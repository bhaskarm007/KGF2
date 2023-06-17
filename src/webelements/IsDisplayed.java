package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsDisplayed {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		if(driver.findElement(By.name("q")).isDisplayed()){
			System.out.println("Pass:: Search TextField is Displayed ");
		}else {
			System.out.println("Fail:: Search TextField is not Displayed");
		}
	}
}

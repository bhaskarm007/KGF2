package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTagName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String expectedTagName = "img";
		String actualTagName = driver.findElement(By.cssSelector("[alt='Google']")).getTagName();
		
		System.out.println("actualTagName="+actualTagName);
		System.out.println("actualTagName="+actualTagName);
		if(actualTagName.equals(expectedTagName)) {
			System.out.println("Pass:: Google logo is image");
		}
		else {
			System.out.println("Fail:: Google logo is not a image");
		}
		//driver.quit();
	}
}

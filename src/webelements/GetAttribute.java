package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		
		//type is attribute name
		String attValue = driver.findElement(By.id("username")).getAttribute("type");
		System.out.println(attValue);
		
	}
}

package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Placeholder {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		String expectedPlaceHolderText = "Username";
		String actualPlaceholderText = driver.findElement(By.id("username")).getAttribute("placeholder");
		System.out.println("actualPlaceholderText ="+actualPlaceholderText);
		System.out.println("expectedPlaceHolderText="+expectedPlaceHolderText);
		if(actualPlaceholderText.equals(expectedPlaceHolderText)) {
			System.out.println("Pass: The  Placeholder text is correct");
		}
		else {
			System.out.println("Fail: The Placeholder text is incorrect");
		}
	//	driver.quit();
	}
}

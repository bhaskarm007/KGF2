package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class GetCssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String expectedHexCode = "#42b72a";
		String actualRGBA = driver.findElement(By.linkText("Create new account")).getCssValue("background-color");
		
		System.out.println(actualRGBA);
		//Converting RGBA color value into HEXCODE
		String actualHexCode = Color.fromString(actualRGBA).asHex();
		
		System.out.println("expectedHexCode="+expectedHexCode);
		System.out.println("actualHexCode="+actualHexCode);
		
		if(actualHexCode.equals(expectedHexCode)) {
			System.out.println("Pass:: Background Color is Correct");
		}else {
			System.out.println("Fail:: Background Color is InCorrect");
		}
		//driver.quit();
		
	}
}

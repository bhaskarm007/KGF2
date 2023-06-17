package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToolTipText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		String expectedText = "Do not select if this computer is shared";
		String actualText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		
		System.out.println("expectedText: "+ expectedText);
		System.out.println("actualText: "+ actualText);
		
		if(actualText!=null) {
		if(actualText.equals(expectedText)) {
			System.out.println("Pass:: Tool tip  text is correct ");
		}else {
			System.out.println("Fail:: Tool tip text is incorrect ");
		}
		}else {
			System.out.println("Fail:: title attribute is not Present");
		}
		//driver.quit();
	}
}

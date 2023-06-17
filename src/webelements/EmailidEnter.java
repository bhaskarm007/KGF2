package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmailidEnter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String expectedEmailid = "canikissyoudarling23@gmail.com";
		WebElement emailidTextField = driver.findElement(By.id("email"));
		
		emailidTextField.sendKeys(expectedEmailid);
		String actualEmailId = emailidTextField.getAttribute("value");
		System.out.println("expectedEmailid ="+expectedEmailid);
		System.out.println("actualEmailId ="+ actualEmailId);
				
		if(emailidTextField!=null) {
			if(actualEmailId.equals(expectedEmailid)) {
				System.out.println("Pass:: Eamil Id Entered Properly");
			}else {
				System.out.println("Fail:: Email Id is not Entered");
			}
		}else {
			System.out.println("Fail:: value Attribute is not present");
		}
		//driver.quit();
	}
}

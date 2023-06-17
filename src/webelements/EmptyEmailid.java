package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmptyEmailid {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String expectedEmailId = "canikissyoudarling23@gmail.com";
		WebElement emailTextField = driver.findElement(By.id("email"));
		String actualEmailid = emailTextField.getAttribute("value");
		
		if(actualEmailid!=null) {
			if(actualEmailid.isEmpty()) {
				System.out.println("Pass:: Email id Text Field is Empty");
			}else {
				System.out.println("Fail:: Email Id TextField is not Empty");
			}
		}else {
			System.out.println("Fail:: Value Attribute is not present");
		}
		 
		
		emailTextField.sendKeys(expectedEmailId);
	  actualEmailid = emailTextField.getAttribute("value");
		
		System.out.println("expectedEmailId="+expectedEmailId);
		System.out.println("actualEmailid="+actualEmailid);
		
		if(actualEmailid!=null) {
			if(actualEmailid.equals(expectedEmailId)) {
				System.out.println("Pass:: Email Id Entered Properly");
			}else {
				System.out.println("Fail:: Email id is not Entered");
			}
		}else {
			System.out.println("Fail:: Value Attribute is not present");
		}
		//driver.quit();
	}
}

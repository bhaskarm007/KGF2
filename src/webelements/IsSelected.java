package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input[@type='radio']"));
		
		if(!maleRadioButton.isSelected()) {
			System.out.println("Pass:: Male Radio Button is Not Selected");
		}else {
			System.out.println("Fail:: Male Radio Button is Selected");
		}
		Thread.sleep(3000);
		maleRadioButton.click();
		if(maleRadioButton.isSelected()) {
			System.out.println("Pass:: Male Radio button is Selected");
		}else {
			System.out.println("Fail:: Mae Radio Button is Not Selected");
		}
		//driver.quit();
	}
}

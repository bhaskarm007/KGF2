package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gettext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		String expectedText = "Administrator:";
		 String actualText = driver.findElement(By.id("adminCredentialsHeader")).getText();
		 System.out.println("expectedText= "+expectedText);
		 System.out.println("actualText= "+actualText);
		 
		 if(expectedText.equals(actualText)) {
			 System.out.println("Pass: Text is correct ");
		 }
			 else {
				 System.out.println("Fail: Text is Incorrect ");
		 }
	}
}

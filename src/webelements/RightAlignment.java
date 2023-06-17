package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RightAlignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		 Rectangle usernameRect= driver.findElement(By.id("username")).getRect();
		 Rectangle passwordRect= driver.findElement(By.name("pwd")).getRect();
		 
		 int usernameEndX = usernameRect.getX()+usernameRect.getWidth();
		 int passwordEndX = passwordRect.getX()+passwordRect.getWidth();
		 System.out.println("usernameEndX="+usernameEndX );
		 System.out.println("passwordEndX="+passwordEndX );
		 
		 if(usernameEndX==passwordEndX) {
			 System.out.println("Pass:: username & password Right Alignment is Correct");
			
		 }else {
			 System.out.println("Fail:: username & password Right Alignment is InCorrect");
		 }
		 driver.quit();
	}
}

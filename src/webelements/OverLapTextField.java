package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OverLapTextField {
	public static void main(String[] args) throws InterruptedException {
		final int space=7;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signin");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div[aria-label='Close']")).click();
		Thread.sleep(3000);
		Rectangle emailidTextFieldRect = driver.findElement(By.name("email")).getRect();
		int emailEndX = emailidTextFieldRect.getX()+emailidTextFieldRect.getWidth()+space;
	
		int passwordStartX= driver.findElement(By.name("pass")).getLocation().getX();
		
		System.out.println("emailEndX="+emailEndX);
		System.out.println("passwordStartX="+passwordStartX);
		if(passwordStartX>emailEndX) {
			System.out.println("Pass:: username & password text field are not Overlap");
		} else {
			System.out.println("Fail::username & password text field are not Overlap");
		}
		driver.quit();		
	}
}

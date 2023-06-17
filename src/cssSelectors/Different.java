package cssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Different {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.actitime.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	//driver.findElement(By.cssSelector("a#loginButton")).click();
	//driver.findElement(By.cssSelector("#loginButton")).click();
	//driver.findElement(By.cssSelector("[id=loginButton]")).click();
	
}}

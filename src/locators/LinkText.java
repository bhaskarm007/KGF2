package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Sign Up")).click();
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("have an account"));
	driver.quit();
	
	
}

}

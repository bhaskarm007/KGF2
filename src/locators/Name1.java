package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Name1 {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.royalchallengers.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.className("is-active")).click();
	driver.quit();
}
}

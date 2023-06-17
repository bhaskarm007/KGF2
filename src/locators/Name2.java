package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Name2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jiosaavn.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.className("c-nav__link")).click();
	driver.quit();
	
	
}}

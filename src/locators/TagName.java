package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TagName {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.incred.com/home/");
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
	driver.findElement(By.tagName("a")).click();
	//driver.quit();
	
}}


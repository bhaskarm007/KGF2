package cssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CssSelector {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://shop-global.malaicha.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}}

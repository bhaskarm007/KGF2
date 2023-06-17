package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText1 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.incred.com/home/");

	driver.manage().window().maximize();
	driver.findElement(By.linkText("Apply Now")).click();
	
	driver.findElement(By.partialLinkText("your dreams into reality"));
	driver.quit();
	

}}

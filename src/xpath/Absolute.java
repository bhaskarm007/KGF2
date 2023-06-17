package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Absolute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://karnatakatourism.org/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/div/div[2]/header/div[2]/div/div[2]/div/nav/ul/li[2]/a/span/span")).click();
	
}}

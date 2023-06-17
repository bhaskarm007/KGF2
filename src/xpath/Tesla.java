package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tesla {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tesla.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/div[4]/div[2]/div/header/ol/li[5]/a/span")).click();
}}

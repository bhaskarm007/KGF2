package cssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DifferentClass {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.incredibleindia-tourism.org/india-tourism.html");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//driver.findElement(By.className("active")).click();
	//driver.findElement(By.cssSelector("a[class='active']")).click();
	//driver.findElement(By.cssSelector("a.active")).click();
	//driver.findElement(By.cssSelector(".active")).click();
	driver.findElement(By.cssSelector("[class='active']")).click();
}
}
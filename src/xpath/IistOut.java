package xpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IistOut {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 List<WebElement> products = driver.findElements(By.id("nav-main"));
		//WebElement element = driver.findElement (By.className("nav nav-pills nav-stacked"));
		//List<WebElement> products = driver.findElements(By.tagName("li"));
		 //List<WebElement> products = driver.findElements (By.cssSelector ("product-item-wrapper")); 
		 //int numberOfProducts = products.size ();
		 //System.out.println("numberOfProducts="+numberOfProducts);
		 //driver.quit();
		//List<WebElement> products = driver.findElements(By.cssSelector("i[class='hmenu-item hmenu-title ']"));
		//List<WebElement> products = driver.findElements(By.linkText("Echo &amp; Alexa"));
		System.out.println("Total number of fetures="+products.size());
		 
	}
}

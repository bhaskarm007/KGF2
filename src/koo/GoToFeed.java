package koo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webelements.SendKeys;
public class GoToFeed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kooapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("Home_goToFeed__sBDJa")).click();
		//driver.findElement(By.cssSelector("button[class='Home_goToFeed__sBDJa']")).click();
		//driver.findElement(By.xpath("//button[text()='Go to Feed']")).click();
		//driver.findElement(By.xpath("//button[@class='Home_goToFeed__sBDJa']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Go to Feed')]")).click();
		//driver.findElement(By.xpath("//button[contains(@class,'Home_goToFeed__sBDJa')]")).click();
		driver.findElement(By.xpath("//div[text()='English']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Koo English']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		WebElement phoneField = driver.findElement(By.id("phone"));
		
		phoneField.sendKeys("9876543210");
		//hear Selenium inbuilt function using
		Thread.sleep(2000);
		phoneField.clear();
		//Keyboard control 
		
		/*phoneField.sendKeys(Keys.CONTROL+"A");
		phoneField.sendKeys(Keys.CONTROL+"C");
		Thread.sleep(5000);
		phoneField.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		*/
		//driver.wait();
		Thread.sleep(2000);
		driver.findElement(By.className("Login_closeBtn__eGbQN")).click();
		
		//driver.quit();
	}
}

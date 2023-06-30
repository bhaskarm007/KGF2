package practicelocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		// use valid username  and password
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("mahibh007"); // username
		driver.findElement(By.name("password")).sendKeys("do//yebhaskarm");  //password
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Not Now']")).click();
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log out']")).click();
		driver.findElement(By.xpath("//button[text()='Log out']")).click();
		driver.quit();
		
		System.out.println("-------------------Now Opening Firefox Browser------------------");
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	   WebDriver driver1 = new FirefoxDriver();
	   driver1.get("https://www.instagram.com/");
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		driver1.findElement(By.name("username")).sendKeys("mahibh007");           //username
		driver1.findElement(By.name("password")).sendKeys("do//yebhaskarm");   //password
		driver1.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//div[text()='Not Now']")).click();
		driver1.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[text()='More']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//span[text()='Log out']")).click();
		driver1.findElement(By.xpath("//button[text()='Log out']")).click();
		driver1.quit();
		
		System.out.println("*************Now Opening Microsoft Edge***************");
		Thread.sleep(2000);
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		   WebDriver driver2 = new EdgeDriver();
		   driver2.get("https://www.instagram.com/");
			driver2.manage().window().maximize();
			Thread.sleep(3000);
			driver2.findElement(By.name("username")).sendKeys("mahibh007");         //username
			driver2.findElement(By.name("password")).sendKeys("do//yebhaskarm");   //password
			driver2.findElement(By.cssSelector("button[type='submit']")).click();
			Thread.sleep(5000);
			driver2.findElement(By.xpath("//div[text()='Not Now']")).click();
			driver2.findElement(By.xpath("//button[text()='Not Now']")).click();
			Thread.sleep(2000);
			driver2.findElement(By.xpath("//div[text()='More']")).click();
			Thread.sleep(2000);
			driver2.findElement(By.xpath("//span[text()='Log out']")).click();
			driver2.findElement(By.xpath("//button[text()='Log out']")).click();
			driver2.quit();
	}
}

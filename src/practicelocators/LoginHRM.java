package practicelocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LoginHRM {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//i did a mistaken hear. This was taken upto two hours
		Thread.sleep(2000); 
		
        driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("I miss you MAHI");
		Thread.sleep(2000);
		System.out.println("COMMENTS CODE LINE,ONE BY ONE OPEN");
		
		
		driver.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
		
		System.out.println("---------Opening Firefox------");
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		
		driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//i did a mistaken hear. This was taken upto two hours
		Thread.sleep(2000); 
		
        driver1.findElement(By.name("username")).sendKeys("Admin");
		driver1.findElement(By.name("password")).sendKeys("admin123");
		driver1.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("I like MAHI");
		Thread.sleep(2000);
		System.out.println("COMMENTS CODE LINE,ONE BY ONE OPEN");
		
		
		driver1.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver1.findElement(By.xpath("//a[text()='Logout']")).click();
		driver1.quit();
		
		System.out.println("******MsEdge*******");
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		
		driver2.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//i did a mistaken hear. This was taken upto two hours
		Thread.sleep(2000); 
		
        driver2.findElement(By.name("username")).sendKeys("Admin");
		driver2.findElement(By.name("password")).sendKeys("admin123");
		driver2.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver2.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Special for me MAHI");
		Thread.sleep(2000);
		System.out.println("COMMENTS CODE Lines,ONE BY ONE OPEN");
		System.out.println("After opening Home page watch the left side search Field area");
		
		
		driver2.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver2.findElement(By.xpath("//a[text()='Logout']")).click();
		driver2.quit();
		
}
}

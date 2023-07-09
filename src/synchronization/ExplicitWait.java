package synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

//Script to Verify Home Page, Users Page and Reports Page is Displayed or not

//Note:: To verify any WebPage We should verify 3 CheckPoints
//1. Window Title of that WebPage 
//2. Url of that WebPage
//3. Any WebElement Specific to that Webpage like Logo, buttons and text etc...

//Note 2:: If the Url or Title contains some Dynamic Values(like product ids, dates etc...) for any page we should use
//            titleContains() and urlToBe() methods
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
//		Thread.sleep(3000);
		
//Note::When you copy Element of title,
	  //it will Automatically adding one extra space in between text value..(line no:: 40) Title name.
		
		try{
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	    System.out.println("Pass:: Home page is Displayed");
		}catch(TimeoutException e) {
		System.out.println("Fail:: Home page is not Displayed");
	    }
		
		driver.findElement(By.id("container_users")).click();
		
		try {
			wait.until(ExpectedConditions.urlContains("userlist.do"));
			System.out.println("Pass:: Users Page is Displayed");
		} catch(TimeoutException e) {
			System.out.println("Fail:: Users Page is not Displayed");
		}
		
		driver.findElement(By.id("container_reports")).click();
	
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='New Report']"))));
			System.out.println("Pass:: Reports page is Displayed");
		} catch(TimeoutException e){
		  System.out.println("Fail:: Reports page is not Displayed");
		}
		
		//driver.quit();
		}
}

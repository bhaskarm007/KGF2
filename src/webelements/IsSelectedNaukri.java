package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IsSelectedNaukri {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(3000);
		//Enter email id(*************) sendKeys
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("*********"); 
		// Enter password(***********) sendKeys
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("**********");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		//driver.navigate().to("https://www.naukri.com/mnjuser/homepage");
		//Thread.sleep(3000);
		driver.findElement(By.linkText("Complete profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Career profile']/following-sibling::span[text()='editOneTheme']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("locationSugg")).click();
		WebElement mumbaiCheckBox = driver.findElement(By.xpath("//li[text()='Mumbai']"));
		
		if(mumbaiCheckBox.getAttribute("class").contains("UnChecked")) {
			System.out.println("Pass:: Mumbai is UnChecked");
		}else {
			System.out.println("Fail:: Mumbai is Checked");
		}
		
		mumbaiCheckBox.click();
		Thread.sleep(3000);
		
		if(mumbaiCheckBox.getAttribute("class").contains("Checked")) {
			System.out.println("Pass:: Mumbai is Checked");
		}else {
			System.out.println("Fail:: Mumbai is UnChecked");
		}
		
		Thread.sleep(3000);
		//both type is checking checkbox and with entering text values
		
		/*
		WebElement enterMumbaiText = driver.findElement(By.cssSelector("input[placeholder='Tell us your location preferences to work']"));
		enterMumbaiText.sendKeys("Mumbai");
		Thread.sleep(3000);
	if(enterMumbaiText != null) {
		WebElement findText = driver.findElement(By.xpath("//div[text()='Mumbai']/strong[text()=', Maharashtra']"));
		findText.click();
		Thread.sleep(3000);
		System.out.println("Pass:: Mumbai text Entered and Selected Mumbai, Maharashtra");
	}else {
		System.out.println("Fail:: Mumbai text is Not Entered and it's Not Selected Mumbai, Maharashtra");
	}     */
		//IT checking purpose only after the enter text, the checkbox clicking
		/*
		mumbaiCheckBox.click();
		Thread.sleep(3000);
		
		if(mumbaiCheckBox.getAttribute("class").contains("Checked")) {
			System.out.println("Pass:: Mumbai is Checked");
		}else {
			System.out.println("Fail:: Mumbai is UnChecked");
		}
         	*/
		driver.quit();
		
	}
}

package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Script to Select Options in a List Box using 3 Selection methods
public class OptionsUsingThreeSelectionMethods {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdirver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		WebElement monthListBox = driver.findElement(By.id("month"));
//  object creation for select class		
		Select sel= new Select(monthListBox);
		
		sel.selectByVisibleText("Jun");
		Thread.sleep(5000);
		
		sel.selectByIndex(7);
		Thread.sleep(5000);
		
		sel.selectByValue("12");
	}

}

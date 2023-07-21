package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Script to Verify if the target List Box is Single Select

public class ListBoxIsSingleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select sel= new Select(monthListBox);
		if (!sel.isMultiple() ) {
			System.out.println("Pass:: Single Select ListBox");
		}else {
			System.out.println("Fail:: Multi Select ListBox");
		}
	}
}

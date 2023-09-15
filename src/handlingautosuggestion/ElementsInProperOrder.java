package handlingautosuggestion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to understand webPage Elements in ProperOrder showing
public class ElementsInProperOrder {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']")).click();
		Thread.sleep(3000);
		List<WebElement> menuLinkList = driver.findElements(By.xpath("//ul[@class='oxd-dropdown-menu']//li/a"));
		List<String> actualOrder = new ArrayList<String>();
		
		
		for(WebElement ele:menuLinkList) {
			actualOrder.add(ele.getText());
		}
		List<String> expectedOrder = Arrays.asList("About", "Support", "Change Password", "Logout");
		System.out.println("actualOrder="+actualOrder);
		System.out.println("expectedOrder="+expectedOrder);
		
		if(actualOrder.equals(expectedOrder)){
			System.out.println("Pass:: Elements are present in the order");
		} else {
			System.out.println("Fail:: Elements are not present in the order");
		}
		driver.quit();
	}
}

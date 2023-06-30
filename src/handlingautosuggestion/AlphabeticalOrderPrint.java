package handlingautosuggestion;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlphabeticalOrderPrint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.name("q")).sendKeys("Selenium");
		
        Thread.sleep(5000);
		List<WebElement> autosuggestionList = driver.findElements(By.xpath("//li[@class='sbct' and not (@id)]"));
	
		System.out.println("autosuggestionList="+autosuggestionList.size());
		Set<String> actualOrder=new TreeSet<String>();
		for(WebElement ele:autosuggestionList) {
			
			actualOrder.add(ele.getText());
		}
		for(String s:actualOrder) {
			System.out.println(s);
		}
		//driver.quit();
	}
}

package handlingautosuggestion;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DefaultAutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().activeElement().click();
    
		List<WebElement> deffaultAutosuggestionList = driver.findElements(By.xpath("//li[@class='sbct' and not (@id)]"));
		
          for (WebElement ele : deffaultAutosuggestionList) {
			System.out.println(ele.getText());
		}
          deffaultAutosuggestionList.get(2).click();
		
		//driver.quit();
	}
}

package handlingautosuggestion;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClickOnLastSuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.name("q")).sendKeys("Selenium");
		
        Thread.sleep(5000);
		List<WebElement> autosuggestionList = driver.findElements(By.xpath("//li[@class='sbct' and not (@id)]"));
		int lastIndex = autosuggestionList.size()-1;
		autosuggestionList.get(lastIndex).click();
		
		//driver.quit();
	}
}

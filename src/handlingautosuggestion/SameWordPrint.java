package handlingautosuggestion;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SameWordPrint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String expectedSuggestion = "selenium";
		String expectedUrlFraction = "selenium";
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		List<WebElement> autosuggestionList = driver.findElements(By.xpath("//li[@class='sbct' and not (@id)]"));
		
		for(WebElement ele:autosuggestionList) {
			System.out.println(ele.getText());
		}
		
		for(WebElement ele:autosuggestionList) {
			if(ele.getText().equals(expectedSuggestion)) {
				ele.click();
				break;
			}
		}
		if(driver.getCurrentUrl().contains(expectedUrlFraction)) {
			System.out.println("Pass:: Clicked on the "+expectedSuggestion);
		}else {
			System.out.println("Fail:: Unable to click on the "+expectedSuggestion);
		}
		driver.quit();
		
	}
}

package handlingautosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountOfAutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		List<WebElement> autosuggestionList = driver.findElements(By.xpath("//li[@class='sbct' and not (@id)]"));
	
		System.out.println("autosuggestionList="+autosuggestionList.size());
		
		if(autosuggestionList.size()>=1 &&  autosuggestionList.size()<=10) {
			System.out.println("Pass:: Autosuggestion Count is Correct");
		}else {
			System.out.println("Fail:: Autosuggestion Count is InCorrect");
		}
		driver.quit();
	}
}

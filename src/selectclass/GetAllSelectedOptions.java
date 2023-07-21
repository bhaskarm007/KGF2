package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Script to understand getAllSelectedOptions().
public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");
		
Select carsSelect = new Select(driver.findElement(By.id("cars")));
		
		carsSelect.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		
		carsSelect.selectByIndex(3);
		Thread.sleep(3000);
		
		carsSelect.selectByValue("opel");
		Thread.sleep(3000);
		
		List<WebElement> allSelectedOptionsList = carsSelect.getAllSelectedOptions();
		System.out.println(allSelectedOptionsList.size());
		
		for (WebElement ele : allSelectedOptionsList) {
			System.out.println(ele.getText());
		}
	}
	
}

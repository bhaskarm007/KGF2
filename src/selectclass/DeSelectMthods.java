package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Program to understand deselect() methods
public class DeSelectMthods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
/*		
		driver.get("https://www.amazon.in/");
		
	Select dropDownSelect = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropDownSelect.selectByVisibleText("Alexa Skills");
		Thread.sleep(3000);
		
		dropDownSelect.selectByIndex(3); //Amazon Fashion
		Thread.sleep(3000);
		
		dropDownSelect.selectByValue("search-alias=amazon-pharmacy");
		Thread.sleep(3000);
	*/

// save it you get a Multiple opetion select website links, it's best for practicing
		
		driver.get("https://demoqa.com/select-menu");
		
		Select carsSelect = new Select(driver.findElement(By.id("cars")));
		
		carsSelect.selectByVisibleText("Volvo");
		Thread.sleep(3000);
		
		carsSelect.selectByIndex(3);
		Thread.sleep(3000);
		
		carsSelect.selectByValue("opel");
		Thread.sleep(3000);
		
// deselecting options	
		
		carsSelect.deselectByVisibleText("Volvo");
		Thread.sleep(3000);
		
		carsSelect.deselectByIndex(3);
		Thread.sleep(3000);
		
		carsSelect.deselectByValue("opel");
		Thread.sleep(3000);
		
//deselecting all		
//		carsSelect.deselectAll();
		
	}
}

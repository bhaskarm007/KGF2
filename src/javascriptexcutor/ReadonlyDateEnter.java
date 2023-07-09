package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to Enter the Date into the Readonly Date TextField using Javascript
public class ReadonlyDateEnter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
		
		String departureDate="17/06/2024";
		WebElement dDatetextField = driver.findElement(By.id("ddate"));
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value=arguments[1];", dDatetextField, departureDate);
		
	}

}

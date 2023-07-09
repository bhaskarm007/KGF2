package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to Enter the Date into the Readonly Date TextField using Javascript

public class DateEnter {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//driver.get("https://www.redbus.in/buses/bangalore-bus-tickets");
	//driver.get("https://www.redbus.in/");
	
	//driver.get("https://selectorshub.com/xpath-practice-page/");
	
	driver.get("https://www.yatra.com/");
	
	
	
	String departureDate="17/6/2024";
	
	//WebElement departDateTextFieled = driver.findElement(By.cssSelector("[placeholder='ONWARD DATE']"));
	//WebElement departDateTextFieled=driver.findElement(By.cssSelector("text[class='dateText']"));

	//WebElement departDateTextFieled=driver.findElement(By.id("datepicker"));
	
//it's not Working 
	WebElement departDateTextFieled=driver.findElement(By.id("BE_flight_origin_date"));
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].value=arguments[1]", departDateTextFieled, departureDate);

}
}

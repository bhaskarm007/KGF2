package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Program to perform drag and drop w/o using dragAndDrop() method.

 public class WithOutUsingDragnDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	

  driver.get("https://demoqa.com/droppable");	
  WebElement sourceEle = driver.findElement(By.id("draggable"));
  WebElement targetEle = driver.findElement(By.id("droppable"));
  Actions action = new Actions(driver);
  action.clickAndHold(sourceEle).moveToElement(targetEle).release().perform();
//  action.clickAndHold(sourceEle).release(targetEle).perform();

/*
    driver.get("https://trello.com/login");
	driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
	driver.findElement(By.id("login")).click();
	
	WebElement loginButton = driver.findElement(By.id("login-submit"));
	wait.until(ExpectedConditions.visibilityOf(loginButton));
	driver.findElement(By.id("password")).sendKeys("Testing@123");
	loginButton.click();
	
	driver.findElement(By.xpath("//h3[text()='Starred boards']/../..//div[@title='My Java Sessions']")).click();
	
	Thread.sleep(5000);
	
	WebElement sourceEle = driver.findElement(By.xpath("//span[text()='Automate 100 Test Cases']"));
	WebElement targetEle = driver.findElement(By.xpath("//h2[text()='Doing']/../..//span[text()='Add a card']"));
	
// Program to perform drag and drop w/o using dragAndDrop() method
	Actions action = new Actions(driver);
//  action.clickAndHold(sourceEle).moveToElement(targetEle).release().perform();

    action.clickAndHold(sourceEle).release(targetEle).perform();

*/
}
}

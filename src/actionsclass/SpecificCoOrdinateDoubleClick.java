package actionsclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// Script to verify double Click on Specific coordinate of the WebPage, create a card and verify it's created 
// Continue from trello login)
public class SpecificCoOrdinateDoubleClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://trello.com/login");
	
	driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
	driver.findElement(By.id("login")).click();
	
	WebElement loginButton = driver.findElement(By.id("login-submit"));
	wait.until(ExpectedConditions.visibilityOf(loginButton));
	driver.findElement(By.id("password")).sendKeys("Testing@123");
	loginButton.click();
	
	driver.findElement(By.xpath("//h3[text()='Starred boards']/../..//div[@title='My Java Sessions']")).click();
//... //h3[text()='Starred boards']/../..//div[text()='My Java Sessions']
	Thread.sleep(5000);
	
// Was to doubleClick() on a specific coordinate in the webpage, crate a card and verify if it is created
	
	Actions action = new Actions(driver);
	action.moveByOffset(640, 410).doubleClick().perform();
	
	driver.findElement(By.id("list-name")).sendKeys("StandUp Meeting");
	driver.findElement(By.cssSelector("input[value='Add']")).click();
	
	List<WebElement> allBoardsList = driver.findElements(By.xpath("//div[@id='board']/div"));
	
	/*
	if (allBoardsList.get(1).getText().contains("StandUp Meeting")) {
		System.out.println("Pass:: StandUp Meeting Created in 2nd Position");
	} else {
        System.out.println("Fail:: StandUp Meeting not Created in 2nd Position");
	}
	*/
	
	for (WebElement ele : allBoardsList) {
		if (ele.getText().contains("StandUp Meeting")) {
			System.out.println("Pass:: StandUp Meeting card is created");
			return;
		}
	}
	System.out.println("Fail:: StandUp Meeting card is not created");
	}
}

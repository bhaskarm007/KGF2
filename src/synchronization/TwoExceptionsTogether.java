package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//1.Using WebDriverWait we can ignore NewException which is not ignored by default
//2.We can ignore 2 Exception together

public class TwoExceptionsTogether {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofSeconds(1));

//      wait.ignoring(StaleElementReferenceException.class);
//      wait.ignoring(NoSuchSessionException.class);
        
        wait.ignoring(StaleElementReferenceException.class, NoSuchSessionException.class);
        
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
        
        Thread.sleep(10000);
       
        driver.quit();
        
//      wait.until(ExpectedConditions.visibilityOf(loginButton));
        
        wait.until(ExpectedConditions.titleIs("Mahi"));
	}

}

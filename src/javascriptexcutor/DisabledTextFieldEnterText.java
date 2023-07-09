package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to enter text into the disabled TextField 
public class DisabledTextFieldEnterText {
public static void main(String[] args) {
	System.setProperty("webdrive.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://selectorshub.com/xpath-practice-page/");
   
    WebElement enterLastNameTextField = driver.findElement(By.cssSelector("input[placeholder='Enter Last name']"));
    JavascriptExecutor jse=(JavascriptExecutor) driver;
    jse.executeScript("arguments[0].value='MAHI';", enterLastNameTextField);
 }
}

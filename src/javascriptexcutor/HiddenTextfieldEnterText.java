package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to enter text into hidden TextField w/o cliking on element

public class HiddenTextfieldEnterText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.facebook.com/signup");
    
    String text="A Boy Can Do enything For girl";
    WebElement customGenderTextField = driver.findElement(By.name("custom_gender"));
    JavascriptExecutor jse= (JavascriptExecutor) driver;
    jse.executeScript("arguments[0].value=arguments[1];", customGenderTextField,text);
}
}

// hear, Click on Custom radio button after executs script, click on custom radio button 
// text is entered w/o clicking on radio button
package javascriptexcutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// ***IQ:: Was to Verify the webpage title and Url w/o using getTitle() and getCurrentUrl()

public class WithoutUsinggetTitleVerify {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	
	String actualTitle = (String)jse.executeScript("return document.title");
	String expectedTitle = "Google";
	
	System.out.println("expectedTitle="+expectedTitle);
	System.out.println("actualTitle="+actualTitle);
	
	if (actualTitle.equals(expectedTitle)) {
		System.out.println("Pass:: Title is Correct");
	} else {
        System.out.println("Fail:: Title is InCorrect");
	}
	
	String actualUrl=(String) jse.executeScript("return document.URL");
	String expectedUrl = "https://www.google.com/";
	
	System.out.println("expectedUrl="+expectedUrl);
	System.out.println("actualUrl="+actualUrl);
	
	if (actualUrl.equals(expectedUrl)) {
		System.out.println("Pass:: Url is Correct");
	} else {
   System.out.println("Fail:: Url is InCorrect");
	}
	//driver.quit();
}
}

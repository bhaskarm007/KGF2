package handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Program to click on the element within a frame using index version

public class ClickOnWithinFrameUsingIndexVer {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com");
	
	driver.findElement(By.cssSelector("a[aria-label='Google apps']")).click();
	
	driver.switchTo().frame(1).findElement(By.linkText("YouTube")).click();

// verify the youtube page correct or not
// that code is balance...????
	String expectedUrl = "https://www.youtube.com/";
    String actualUrl = driver.getCurrentUrl();
    
    System.out.println("expectedUrl="+expectedUrl);
    System.out.println("actualUrl="+actualUrl);
    
    if (actualUrl.equals(expectedUrl)) {
		System.out.println("Pass:: Youtube HomePage is Correct");
	} else {
        System.out.println("Fail:: Youtube HomePage is notCorrect");
	}
}
}

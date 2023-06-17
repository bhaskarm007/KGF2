package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.coursera.org/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//driver.findElement(By.className("css-19qryfx")).click();
	//driver.quit();
	
	
}
}

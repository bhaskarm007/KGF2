package basics;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	Thread.sleep(5000);
	driver.get("https://twitter.com/");
	Navigation navigation = driver.navigate();
	
	navigation.back();
	Thread.sleep(5000);
	navigation.forward();
	Thread.sleep(5000);
	navigation.refresh();
	Thread.sleep(5000);
	driver.quit();
	
}
}

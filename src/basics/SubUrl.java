package basics;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubUrl {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.licindia.in/");
Navigation navigation = driver.navigate();
navigation.to("https://www.licindia.in/Products/Insurance-Plan");
Thread.sleep(5000);
driver.quit();
}
}

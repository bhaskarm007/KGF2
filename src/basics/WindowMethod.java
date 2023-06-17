package basics;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.meesho.com/");
	Thread.sleep(5000);
	Window window = driver.manage().window();
	window.maximize();
	Thread.sleep(5000);
	window.minimize();
	Thread.sleep(5000);
	window.fullscreen();
driver.quit();
	
}
}

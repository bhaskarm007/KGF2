package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/shop/women");
	driver.manage().window().maximize();
	Set<String> allWindowIds = driver.getWindowHandles();
	for(String windowId:allWindowIds) {
		driver.switchTo().window(windowId);
		if(driver.getTitle().equals("WOMEN")) {
			break;
		}
	}
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.quit();
}
}

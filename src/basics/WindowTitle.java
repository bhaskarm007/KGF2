package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTitle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com");
	driver.manage().window().maximize();
	//Capture all Window Id's
	Set<String> allWindowIds = driver.getWindowHandles();
	//To fetch each window Id Iteratively (one by one)
	for(String allWindowId:allWindowIds) {
		//To Transfer control iteratively
		driver.switchTo().window(allWindowId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
	//driver.quit();
}
}

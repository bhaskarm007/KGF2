package basics;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindowId {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.perniaspopupshop.com/");
	//Thread.sleep(5000);
	Set<String> allWindowIds = driver.getWindowHandles();
	System.out.println("allWindowIds="+allWindowIds);
	for(String windowId:allWindowIds) {
		System.out.println(windowId);
	}
	//driver.quit();
}
}

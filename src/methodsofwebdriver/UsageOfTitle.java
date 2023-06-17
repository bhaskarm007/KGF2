package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTitle {
public static void main(String[] args) {
	// set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
	// Instantiate the browser specific path
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.google.com");
      driver.get("https://www.actitime.com/");
      String expectedHomepageTitle = "actiTIME - Time Tracking Software";
      System.out.println("expectedHomepageTitle="+expectedHomepageTitle);
      String actualHomepageTitle;
      String actualHomepageTitle1 = driver.getTitle();
      System.out.println("actualHomepageTitle="+actualHomepageTitle1);
      
}
}

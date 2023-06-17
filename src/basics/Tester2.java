package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester2 {
public static void main(String[] args) {
	//set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiate the Browser specific class
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.close();
	
	System.setProperty("webdriver.firefox.driver", "./driver/geckodriver.exe");
	FirefoxDriver driver1 = new FirefoxDriver();
	driver1.get("https://www.google.com/");
	driver1.get("https://www.facebook.com/login/");
}
}

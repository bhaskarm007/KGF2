package methodsofwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandle {
public static void main(String[] args) {
	// Set the driver Executable path
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	// Instantiate Browser specific class
	FirefoxDriver driver = new FirefoxDriver();
	//maximize the Browser window
	driver.manage().window().maximize();
	// Pass the main url of the application
	driver.get("https://www.youtube.com/");
	// Capture the current window ID
	String currentWindowID = driver.getWindowHandle();
	System.out.println("currentWindowID="+currentWindowID);
	//minimize and Terminate the session
	driver.manage().window().minimize();
	driver.quit();
}
}

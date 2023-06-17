package methodsofwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class StringUrl {
public static void main(String[] args) throws Throwable {
	// set the driver executable path 
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	// Instantiate the Browser sepecific class 
	FirefoxDriver driver = new FirefoxDriver();
	// maximize browser window
	// pre-conditon for all the automation scripts
	driver.manage().window().maximize();
	// Pass the main url of the application
	driver.get("https://www.amazon.com/");
	Thread.sleep(5000);
	// navigate to customer service
	driver.navigate().to("https://www.amazon.com/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice");
	Thread.sleep(5000);
	// navigate to login & Password
	driver.navigate().to("https://www.amazon.com/gp/help/customer/account-issues/ref=ap_login_with_otp_claim_collection?");
	Thread.sleep(5000);
	// Post condition
	driver.manage().window().minimize();
	// Terminate the session
	driver.quit();
}
}

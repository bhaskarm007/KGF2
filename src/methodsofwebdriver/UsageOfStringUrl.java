package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfStringUrl {
public static void main(String[] args) throws Throwable {
	// Set the driver excutable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// Instantiate the browser specific class
	ChromeDriver driver = new ChromeDriver();
	// maximize the browser window
	// pre-condition of all the automation script
	driver.manage().window().maximize();
	// Pass the main URL of  the Application
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	//navigate to create page of facebook
	driver.navigate().to("https://www.facebook.com/pages/create/?ref_type=registration_form");
	Thread.sleep(5000);
	//navigate to forgetton password page of facebook
	driver.navigate().to("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	Thread.sleep(5000);
	//Post conditon
	driver.manage().window().minimize();
	// Terminate the session
	driver.quit();
	
}
}

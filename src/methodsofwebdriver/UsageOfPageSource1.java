package methodsofwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UsageOfPageSource1 {
public static void main(String[] args) {
	// Set the Driver Executable path
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	// Instantiate the Browser specific class
	FirefoxDriver driver = new FirefoxDriver();
	// Pass the main URL of the application
	driver.get("https://www.actitime.com/demo-request");
	//String expectedText="Please identify yourself";
	//Capture the PageSource
	String loginPageSource = driver.getPageSource();
	// System.out.println(LoginPageSource);
	// we are comaparing the entire pageSource i.e whole object with the part object i.e the piece of string
if(loginPageSource.contains("Request Demo of actiTIME")) {
	System.out.println("Pass: The Expected text is Present in the WebPage.");
}else {
	System.out.println("Fail: The Expected text is not present in the WebPage.");
}
driver.quit();
}
}

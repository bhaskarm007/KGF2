package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCurrentUrl {
public static void main(String[] args) {
	// set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
	//Instantiate the Browser Specific class
	//Step 01: Launch the ChromeBowser
	ChromeDriver driver = new ChromeDriver();
	//Step 02:Pass the main URL of the application
	driver.get("https://www.actitime.com/");
	//Step 03:Verify login page Title
	
	String expectedTitle = "Free Timesheet Online Trial";
	System.out.println("expectedTitle="+expectedTitle);
	
	String actualTitle = driver.getTitle();
	System.out.println("actualTitle="+actualTitle);
	
	String expectedLoginPageUrl = "https://www.actitime.com/free-online-trial";
	driver.manage().window().maximize();

	
	System.out.println("expectedLoginPageUrl="+expectedLoginPageUrl);
	String actualLoginPageUrl = driver.getCurrentUrl();
	
	if(actualTitle.equals(expectedTitle)) {
		if(actualLoginPageUrl.equals(expectedLoginPageUrl)) {
			System.out.println("Pass: The Login page is displayed upon verification of it's title and url");
		}
	}
	else {
		System.out.println("Fail:The Login page is not displayed upon the verification of it's title and url");
	}
	//terminate the session
	driver.quit();
}
}

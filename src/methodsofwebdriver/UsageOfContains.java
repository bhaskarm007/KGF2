package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfContains {
public static void main(String[] args) {
	// Set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// Instantiate the Browser specific class
	ChromeDriver driver = new ChromeDriver();
	// Pass the main url of the Application
	driver.get("https://www.drdo.gov.in/");
	String expectedDrdoHomepageTitle = "DRDO";
			System.out.println("expectedDrdoHomepageTitle="+expectedDrdoHomepageTitle);
	// get the title of the webpage
	String actualDrdoHomepageTitle = driver.getTitle();
	System.out.println("actualDrdoHomepageTitle="+actualDrdoHomepageTitle);
	// Verified the actualHomePageTitle contains DRDO or not
	if(actualDrdoHomepageTitle.contains(expectedDrdoHomepageTitle)) {
		System.out.println("Pass:HomePageTitle is verified and found DRDO");
	}else {
		System.out.println("Fail:HOMEPageTitle is verified and not found DRDO");
	}
	driver.quit();
}
//Post condition 
// Terminate the session
}


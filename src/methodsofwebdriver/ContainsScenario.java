package methodsofwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ContainsScenario {
public static void main(String[] args) {
	// set the driver excutable path
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	// Instantiate the Browser specific class
	FirefoxDriver driver = new FirefoxDriver();
	// Pass the main URL of the Application
	driver.get("https://www.drdo.gov.in/");
	String expectedDrdoHomepageTitle = "Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
	System.out.println("expectedDrdoHomepageTitle="+expectedDrdoHomepageTitle);
	
	String actualDrdoHomepageTitle = driver.getTitle();
	
	System.out.println("actualDrdoHomepageTitle="+actualDrdoHomepageTitle);
	
	if(actualDrdoHomepageTitle.contains(expectedDrdoHomepageTitle)) {
		System.out.println("Pass: DRDO Home Page Title is verified and found correct");
	}else {
		System.out.println("Fail:DRDO HOme Page Title is verified and found incorrect");
	}
	//Post condition
	//Terminate the session
	driver.quit();
}
}

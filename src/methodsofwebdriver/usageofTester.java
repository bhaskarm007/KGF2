package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class usageofTester {
public static void main(String[] args) {
	// set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// Instantiate the Browser specific class
	ChromeDriver driver = new ChromeDriver();
	//Pass the main URl of the Application
	driver.get("https://www.drdo.gov.in/");
	String expectedDrdoHomepageTitle = "Defence Research and Development Organisation - DRDO, Ministry of Defence, Government of India";
	System.out.println("expectedDrdoHomepageTitle="+expectedDrdoHomepageTitle);
	
	String actualDrdoHomepageTitle;
	
	String actualDrdoHomepageTitle1 = driver.getTitle();
	System.out.println("actualDrdoHomepageTitle="+actualDrdoHomepageTitle1);
	
	// Verified the Title Home page Title
	if(actualDrdoHomepageTitle1.equals(expectedDrdoHomepageTitle)) {
		System.out.println("Pass: DRDO Home Page Title is verfied and founded correct");
		
	}else
	{
		System.out.println("fail: DRDO Home page title is verified and found Incorrect");
	}
	driver.quit();
}
}

package methodsofwebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet{
	public static void main(String[] args) {
		//set the driver executable path
		
		System.setProperty("webdriver.chrome.driveer", "./drivers/chromedriver.exe");
		//Instantiate the browser specific class
		
		ChromeDriver driver = new ChromeDriver();
		//pass the main URL fully Qyalified URL 
		
		driver.get("https://www.facebook.com/");
		// This is used to close the current window which is under control
		
		
		driver.close();
		//Past condition
		//Terminate the session
		// close the Chromedriver.exe file Mini server
		// close all the window opened in the same session
		driver.quit();
	}
}

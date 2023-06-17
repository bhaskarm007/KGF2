package methodsofwebdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToUrlUrl {
public static void main(String[] args) throws Throwable  {
	// set the driver executable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	// Instantiate the Browser specific class
	ChromeDriver driver = new ChromeDriver();
	// maximize the browser window
	//pre-conditon of all the automation script
	driver.manage().window().maximize();
	//Pass the main url of the application
	driver.get("https://www.dassault-aviation.com/en/");
	
     URL mainurl = new URL("https://www.dassault-aviation.com/en/");
	 URL defensePage = new URL (mainurl,"Defense");
     URL groupPage = new URL(mainurl,"Group");
     URL civilPage = new URL(mainurl,"Civil");
     URL spacepage = new URL(mainurl,"Space");
     URL passionpage = new URL(mainurl,"Passion");
     Thread.sleep(5000);
     
     driver.navigate().to(groupPage);
     Thread.sleep(5000);
     
     driver.navigate().to(defensePage);
     Thread.sleep(5000);
     // we once again go back group page
     driver.navigate().back();
     Thread.sleep(5000);
     driver.navigate().forward();
     Thread.sleep(5000);
     
     
     driver.navigate().to(civilPage);
     Thread.sleep(5000);
     
     driver.navigate().to(spacepage);
     Thread.sleep(5000);
     
     // hear once again page refreshing
     driver.navigate().refresh();
     Thread.sleep(5000);
     
     driver.navigate().to(passionpage);
     Thread.sleep(5000);
     
     driver.manage().window().minimize();
     driver.quit();
}

}

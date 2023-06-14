package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester1 {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    
  ChromeDriver driver=new ChromeDriver();
  driver.get ("https://www.google.com"); 

   
   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
   FirefoxDriver driver1 =new FirefoxDriver();

   driver1.get("https://www.facebook.com");
   
              driver1.close();
	}

}



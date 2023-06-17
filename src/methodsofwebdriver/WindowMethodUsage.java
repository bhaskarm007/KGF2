package methodsofwebdriver;


import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WindowMethodUsage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver.", "./drivers/chromedriver.exe");
         ChromeDriver driver= new ChromeDriver();
         driver.get("https://www.google.com/");
         Thread.sleep(5000);
         Window window = driver.manage().window();
         window.maximize();
         Thread.sleep(5000);
         window.minimize();
         Thread.sleep(5000);
         window.fullscreen();
         Thread.sleep(5000);
         driver.quit();
         
         
         System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
         EdgeDriver driver1=new EdgeDriver();
         driver1.get("https://www.google.co.in/");
         Thread.sleep(5000);
         Window window1 = driver1.manage().window();
         window1.maximize();
         Thread.sleep(5000);
         window1.minimize();
         Thread.sleep(5000);
        window1.fullscreen();
        Thread.sleep(5000);
         driver1.quit();
         
         
         System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
         FirefoxDriver driver2=new FirefoxDriver();
         driver2.get("https://www.google.com/");
         Thread.sleep(5000);
         Window window2 = driver2.manage().window();
         window2.maximize();
         Thread.sleep(5000);
         window2.minimize();
         Thread.sleep(5000);
         window2.fullscreen();
         driver2.quit();
         
       /*  System.setProperty("webdriver.opera.driver", "./drivers/operadriver.exe");
        // OperaDriver driver3=new OperaDriver();
          WebDriver driver3 = new OperaDriver();
           
         driver3.get("https://www.google.com");
         Thread.sleep(5000);
         Window window3 = driver3.manage().window();
         window3.maximize();
         Thread.sleep(5000);
         window3.minimize();
         Thread.sleep(5000);
         //window3.fullscreen();
         driver3.quit();
         */
         
	}

}

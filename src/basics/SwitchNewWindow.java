package basics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewWindow {
public static void main(String[] args) {
	System.setProperty("webdrive.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.nykaafashion.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);//newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.nykaafashion.com/women/c/6557?root=topnav_1");
    
	//driver.close();
driver.quit();
}
}

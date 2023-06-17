package basics;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewTab {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.faballey.com/");
	driver.manage().window().maximize();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.houseofindya.com/");
	driver.quit();
	
}
}

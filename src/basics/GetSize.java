package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.elle.com/");
	Dimension dimension = driver.manage().window().getSize();
	System.out.println("Height="+dimension.getHeight());
	System.out.println("Width="+dimension.getWidth());
	driver.quit();
}
}

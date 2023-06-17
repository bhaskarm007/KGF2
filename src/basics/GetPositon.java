package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.nike.com/in/women");
	Point point = driver.manage().window().getPosition();
	int startX = point.getX();
	int startY = point.getY();
	System.out.println("start X="+startX);
	System.out.println("start Y="+startY);
driver.quit();	
}
}

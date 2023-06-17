package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SizeLocationRect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		//Using getSize() method
		Dimension dim = usernameTextField.getSize();
		
		System.out.println("width ="+dim.getWidth());
		System.out.println("height ="+dim.getHeight());
		
		//Using getLocation() method
		Point pnt = usernameTextField.getLocation();
		
		System.out.println("Start X="+pnt.getX());
		System.out.println("Start Y="+pnt.getY());
		
		System.out.println("-------------Using getRect() method----------------");
		//Using getRect() method
		Rectangle rect = usernameTextField.getRect();
		
		System.out.println("Width="+rect.getWidth());
		System.out.println("Height="+rect.getHeight());
	
		System.out.println("Start X="+rect.getX());
		System.out.println("Start Y="+rect.getY());
		
		//driver.quit();
	}
}

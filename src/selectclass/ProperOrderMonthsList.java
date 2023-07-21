package selectclass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Was to verify whether months list is in proper order
public class ProperOrderMonthsList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		
		Select monthlist= new Select(driver.findElement(By.id("month")));
		List<WebElement> optionList = monthlist.getOptions();
		List<String> actualOrder = new ArrayList<String>();
		
		for (WebElement ele : optionList) {
			System.out.print(ele.getText()+ " ::"); // Hear used "print" NOT a....
			System.out.println(ele.getAttribute("value"));
		}
// Check proper order...?		
		
	}
}

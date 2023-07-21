package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Select last option in the listbox

public class LastOptionSelect {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.instauae.ae/uae/tour.php");
	
	Select countryCodeSelect = new Select(driver.findElement(By.id("country_isd_code")));
//  List<WebElement> optionsList = countryCodeSelect.getOptions();

	// it's dependence on webpage loading speed	
	Thread.sleep(5000);
	
	countryCodeSelect.selectByIndex(countryCodeSelect.getOptions().size()-1);
 
// check Alphabetical order	
}
}

package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// *** IQ Program to understand when to use selectByIndex();
// Whenever there are duplicates
public class ImpSelectByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://harvesthq.github.io/chosen/");
		
		Select countrySelect = new Select(driver.findElement(By.xpath("//em[text()='Turns This']/following-sibling::select[@multiple]")));
		
		countrySelect.selectByIndex(1);
		
		List<WebElement> allSelectedOptionsList = countrySelect.getAllSelectedOptions();
		
		System.out.println(allSelectedOptionsList.size());
		
		for (WebElement ele : allSelectedOptionsList) {
			System.out.println(ele.getText());
		}
	}
}

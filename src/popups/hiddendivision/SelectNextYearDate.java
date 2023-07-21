package popups.hiddendivision;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
//***IQ ==> Program to select Next year's Date

public class SelectNextYearDate {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now().plusYears(1);
		int day =ldt.getDayOfMonth();
		String month =ldt.getMonth().name();
		int year= ldt.getYear();
		
        // Converting 1st 3 Letters of Month in Camel Case
		month=month.substring(0, 1).toUpperCase()+month.substring(1, 3).toLowerCase();

        // Concatenating Month And Year for comparision
        String expectedMonthAndYear = month +" "+year;		
		
        
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
		driver.findElement(By.id("ddate")).click();
		
		outerLoop:
			for(;;) {
                // Storing 2 monthAndYears in current widget
				List<WebElement> monthAndYearsList = driver.findElements(By.className("month2"));
	
                // Iterating and comparing whether any one is matching the 	expectedMonthAndYear
                for (WebElement ele:monthAndYearsList) {
					if (ele.getText().equalsIgnoreCase(expectedMonthAndYear)) {
						driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//li[text()='"+day+"']")).click();
						break outerLoop;
					}
				}
                // Go to the next widget if expectedMonthAndYear is not in current widget
                driver.findElement(By.id("img2Nex")).click();
			}
	}
}

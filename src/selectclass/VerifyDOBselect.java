package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Script to Select the DOB and Verify
public class VerifyDOBselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/signup");
		
		String expday = "17";
		String expmonth = "Jun";
		String expyear = "1998";
		
	    Select daySelect= new Select(driver.findElement(By.id("day")));
	    Select monthSelect = new Select(driver.findElement(By.id("month")));
	    Select yearSelect= new Select(driver.findElement(By.id("year")));
	    
	    daySelect.selectByVisibleText(expday);
	    monthSelect.selectByVisibleText(expmonth);
	    yearSelect.selectByVisibleText(expyear);
	    
	    String actualDay = daySelect.getFirstSelectedOption().getText();
	    String actualMonth = monthSelect.getFirstSelectedOption().getText();
	    String actualYear = yearSelect.getFirstSelectedOption().getText();
	    
	    System.out.println("expectedDay ="+expday);
		System.out.println("actualDay ="+actualDay);
		
		if (actualDay.equals(expday)) {
			System.out.println("Pass:: Day is Correct");
			
		} else {
System.out.println("Fail:: Day is InCorrect ");
		}
		
		
		System.out.println("expectedMonth="+expmonth);
		System.out.println("actualMonth="+actualMonth);
		
		if (actualMonth.equals(expmonth)) {
			System.out.println("Pass:: Month is Correct");
		} else {
System.out.println("Fail:: Month is InCorrect");
		}
		
		
		System.out.println("expectedYear="+expyear);
		System.out.println("actualYear="+actualYear);
		
		if (actualYear.equals(expyear)) {
			System.out.println("Pass:: Year is Correct");
		} else {
System.out.println("Fail:: Year is InCorrect");
		}
	}
}

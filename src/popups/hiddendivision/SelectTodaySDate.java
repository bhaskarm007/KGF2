package popups.hiddendivision;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to Select today's Date

public class SelectTodaySDate {
public static void main(String[] args) {
	
	LocalDateTime ldt=LocalDateTime.now();
	int day = ldt.getDayOfMonth();
	int year=ldt.getYear();
	String month = ldt.getMonth().name();
	
	month =month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
	
	System.out.println(day);
	System.out.println(month);
	System.out.println(year);
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.cleartrip.com/");
	
	driver.findElement(By.xpath("//div[contains(@class,'homeCalender')]")).click();
	driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//div[text()='"+day+"']")).click();
}
}

package cssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class All {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://karnatakatourism.org/");
	driver.manage().window().maximize();
	
	//driver.findElement(By.id("myInput")).click();
	
	//driver.findElement(By.name("tour")).click();
	
	//driver.findElement(By.className("biginput")).click();
	
	//driver.findElement(By.linkText("Sign up to newsletter")).click();
	
	//driver.findElement(By.partialLinkText("newsletter")).click();
	
	/*driver.findElement(By.cssSelector("input[type='submit']")).click();
	driver.findElement(By.cssSelector("input[class='submit-butt']")).click();
	driver.findElement(By.cssSelector("input.submit-butt")).click();
	driver.findElement(By.cssSelector(".submit-butt")).click();
	driver.findElement(By.cssSelector("[class='submit-butt']")).click();
	*/
	
	driver.findElement(By.cssSelector("select[id='lang_choice_polylang-9']")).click();
	/*
	driver.findElement(By.cssSelector("select#lang_choice_polylang-9")).click();
	driver.findElement(By.cssSelector("#lang_choice_polylang-9")).click();
	
	driver.findElement(By.cssSelector("[id='lang_choice_polylang-9']")).click();
	*/
	
	
}
}

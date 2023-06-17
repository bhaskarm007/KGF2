package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("search"));
        driver.findElement(By.name("search_query")).sendKeys("selenium");
        driver.findElement(By.id("search-icon-legacy")).click();
		//driver.findElement(By.className("style-scope ytd-searchbox")).click();
	}

}

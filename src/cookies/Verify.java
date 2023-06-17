package cookies;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com");
	driver.manage().window().maximize();
	int expectedCount = 2;
	int actualCount = driver.manage().getCookies().size();
	System.out.println("expectedCount="+expectedCount);
	System.out.println("actualCount="+actualCount);
	if(actualCount==expectedCount) {
		System.out.println("Pass::Cookies Count is Correct");
	}else {
		System.out.println("Fail::Cookies Count is not Correct");
	}
	driver.manage().deleteAllCookies();
	if(driver.manage().getCookies().size()==0) {
		System.out.println("Pass:: Cookies are deleted");
	}else {
		System.out.println("Fail::Cookies are not Deleted");
	}
	//driver.quit();
	
}
}

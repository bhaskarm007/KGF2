package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetHTTPonly {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://demo.actitime.com");
	Cookie cookie = driver.manage().getCookieNamed("JSESSIONID");
	if(cookie.isHttpOnly()) {
		System.out.println("Pass:: It's HTTP only cookie");
	}else {
		System.out.println("Fail:: It's not HTTPOnly cookie");
	}
	if(cookie.isSecure()) {
		System.out.println("Pass:: It is Secure cookie");
	}else {
		System.out.println("Fail:: It is not Secure cookie");
	}
	//driver.manage().window().minimize();
	//driver.close();
}
}

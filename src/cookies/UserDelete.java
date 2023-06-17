package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserDelete {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    
    driver.get("https://demo.actitime.com");
    
    boolean cookiePresent = false;
    String cookieName = "JSESSIONID";
    
    Set<Cookie> allCookies = driver.manage().getCookies();
    
    for (Cookie cookie : allCookies) 
    {
		if(cookie.getName().equalsIgnoreCase(cookieName)) {
			cookiePresent=true;
			break;
		}
	}
    
    if (cookiePresent) {
		System.out.println("Pass:: JSESSIONID cookie is available");
	}else {
		System.out.println("Fail:: JSESSIONID cookie is not available");
		
	}
    driver.manage().deleteCookieNamed(cookieName);
    
    cookiePresent=false;
    allCookies=driver.manage().getCookies();
    for (Cookie cookie : allCookies) {
		if(cookie.getName().equalsIgnoreCase(cookieName)) {
			cookiePresent=true;
			break;
		}
	}
    
    if (!cookiePresent) {
    	System.out.println("Pass:: JSESSIONID cookie is not available");
		
	}else {
		System.out.println("Fail:: JSESSIONID cokkie is available");
	}
    //driver.quit();
}
}

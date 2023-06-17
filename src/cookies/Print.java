package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com");
driver.manage().window().maximize();

Set<Cookie> allCookies = driver.manage().getCookies();
for(Cookie cookie:allCookies)
{
	System.out.println(cookie.getDomain()+":-----:"+cookie.getName()+":-----:"+cookie.getExpiry());
}
//driver.quit();
}
}

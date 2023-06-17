package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TextVerify {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.lykalabs.com/");
	String expectedText = "Lyka Labs Limited";
	driver.manage().window().maximize();
	String pageSrc = driver.getPageSource();
	if(pageSrc.contains(expectedText)) {
		System.out.println("Pass:: Text is Present");
	}
	else {
		System.out.println("fail:: Text is not Present");
	}
	driver.close();
}
}

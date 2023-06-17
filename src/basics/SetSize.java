package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zivame.com/");
		driver.manage().window().setSize(new Dimension(600,800));
		//Thread.sleep(5000);
		driver.quit();
	}

}

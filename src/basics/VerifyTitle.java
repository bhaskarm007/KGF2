package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String expectedTitle = "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle="+expectedTitle);
		System.out.println("actualTitle="+actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass::Title is correct");
			
		}
		else
		{
			System.out.println("Fail:: Title is Incorrect");
		}
		driver.close();
	}
}

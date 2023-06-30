package runtimepolymerphism;

import org.openqa.selenium.WebDriver;
//This class is dependendent on Mainmethod class
public class Factory {

	public static void test(WebDriver driver) throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// Code to Verify the URL
		String expectedUrl = "https://www.google.com/";
		String actualUrl = driver.getCurrentUrl();
		System.out.println("expectedUrl="+expectedUrl);
		System.out.println("actualUrl="+actualUrl);
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Pass:: Url is Correct");
		} else {
			System.out.println("Fail:: Url is Incorrect");

		}
		
		// Code to Verify the Title
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		System.out.println("expectedTitle="+expectedTitle);
		System.out.println("actualTitle="+actualTitle);
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass:: Title is Correct");
		} else {
			System.out.println("Fail:: Title is Incorrect");
	}
		Thread.sleep(5000);
		driver.quit();
	}
}


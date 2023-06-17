package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlternativeText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String expectedText = "Flipkart";
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	 WebElement text = driver.findElement(By.tagName("img"));
		String actualText = text.getAttribute("alt");
		
		System.out.println("ExpectedText="+expectedText);
		System.out.println("actualText="+actualText);
		
		if(actualText!=null) {
		if(actualText.equals(expectedText)) {
			System.out.println("Pass:: The Alternative text is correct");
		}else
		{
			System.out.println("Fail:: The text is incorrect");	
			}
		}
		else {
			System.out.println("Fail:: Alternative text Attribute is not present");
		}
		driver.quit();
	}
}

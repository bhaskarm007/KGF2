package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCssValueTextBold {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		String ExpectedFontWait="700";
		String actualFontwait = driver.findElement(By.id("adminCredentialsHeader")).getCssValue("font-weight");
	
	System.out.println("ExpectedFontWait="+ExpectedFontWait);
	System.out.println("actualFontwait="+actualFontwait);
	
	if(actualFontwait.equals(ExpectedFontWait)) {
		System.out.println("Pass:: Administrator: Text is Bold");
	} else {
		System.out.println("Pass:: Administrator: Text is Not Bold");
	}
	//driver.quit();
	}
}

package popups.fileupload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Was to upload a InValid file(More than given Size i.e > 2MB)verify apt Error Message is Displayed

public class InvalidFileErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Actions action = new Actions(driver);
// Scrolling the Custom Scroll Bar.		
		action.sendKeys(Keys.PAGE_DOWN).perform();
     	 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Upload Resume']")));
		Thread.sleep(3000);
		driver.findElement(By.id("resumeUpload")).sendKeys("E:\\d\\CS NOTES\\LEGAL_APTITUDE_AND_LOGICAL_REASONING CSEET(Above 2MB).pdf");
		
		String expectedErrorText = "Resume uploaded exceeds maximum file size limit (2 MB).";
		
		String actualErrorText = driver.findElement(By.xpath("//div[contains(@class,'resume-upload-container')]")).getText();
		
		System.out.println("expectedErrorText="+expectedErrorText);
		System.out.println("actualErrorText="+actualErrorText);
		
// Page is Displayed but it's not scrolling some time 
// bcz of that it will goes else condition.		
		
		if (actualErrorText.equals(expectedErrorText)) {
			System.out.println("Pass:: Error is Displayed");
		} else {
            System.out.println("Fail:: Error is Not Displayed");
		}
	}
}

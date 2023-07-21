package popups.fileupload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Was to upload a InValid file(.jpg file as it is restricted here )and verify apt Error Message is Displayed
public class UploadInvalidFile {

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
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Upload Resume']")));
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Practice\\Alone.jpg");

//		WebElement resumeUploadButton = driver.findElement(By.id("resumeUpload"))..sendKeys("C:\\Users\\Lenovo\\Desktop\\Practice\\Alone.jpg");
//		Thread.sleep(5000);
//		resumeUploadButton.click();
//		resumeUploadButton.sendKeys("C:\\Users\\Lenovo\\Desktop\\Practice\\Alone.jpg");
		
		String expectedErrorText = "File extension not supported. Supported file extensions: .docx, .doc, .pdf, .rtf";
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

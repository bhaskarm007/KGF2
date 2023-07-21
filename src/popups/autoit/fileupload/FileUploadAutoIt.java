package popups.autoit.fileupload;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



// Program to Use Auto IT Script and Handle File Upload

public class FileUploadAutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	
		Actions action = new Actions(driver);
// Scrolling the Custom Scroll Bar.		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        
		
		Runtime.getRuntime().exec("E:\\AutoIT Script\\FileUploadScript.exe");
	}
}
// File name itshould be:  "E:\AutoIT Script\FileUploadScript.au3"
/* this is AutoIT code
 Sleep(5000)
Send("E:\bhaskar_resume exp.pdf")
Sleep(5000)
Send("{Enter}")
*/

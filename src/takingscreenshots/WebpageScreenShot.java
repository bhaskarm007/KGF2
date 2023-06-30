package takingscreenshots;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebpageScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
		 File tempFile = ts.getScreenshotAs(OutputType.FILE);
		 
		 String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		 
		 String newFilePath = "./errorshots/"+timeStamp+" Fb LoginPage.png";
		 
		 FileUtils.copyFile(tempFile, new File(newFilePath));
		 
		 driver.quit();
	}
}

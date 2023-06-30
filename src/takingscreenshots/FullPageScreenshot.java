package takingscreenshots;
import java.io.File;

import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;

public class FullPageScreenshot {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		HasFullPageScreenshot ts = (HasFullPageScreenshot) driver;
		
		File tempFile = ts.getFullPageScreenshotAs(OutputType.FILE);
		
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		String newFilePath = "./errorshots/"+timeStamp+"FbLoginFullPage.png";
		
		FileUtils.copyFile(tempFile, new File(newFilePath));
		
		driver.quit();
	}
}

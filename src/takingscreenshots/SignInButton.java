package takingscreenshots;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SignInButton {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		File tempFile = driver.findElement(By.linkText("Sign in")).getScreenshotAs(OutputType.FILE);
		
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		String newFilePath = "./errorshots/"+timeStamp+" SignButton.png";
		FileUtils.copyFile(tempFile,new File(newFilePath));
		
		driver.quit();
		
	}
}

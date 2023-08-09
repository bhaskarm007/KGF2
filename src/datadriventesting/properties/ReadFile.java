package datadriventesting.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to Understand .properties file read
public class ReadFile {

	public static void main(String[] args) throws IOException {
	
		String filePath = "./resources/config.properties";
		
		FileInputStream fin = new FileInputStream(filePath);
		
		Properties properties = new Properties();
		
		properties.load(fin);
		
		String key = properties.getProperty("chrome_key");
		String value = properties.getProperty("chrome_path");
		String ito = properties.getProperty("ito");
// converting string into Long		
		long implicit = Long.parseLong(ito);
		String eto = properties.getProperty("eto");
		long explicit = Long.parseLong(eto);
		
		System.out.println("key="+key);
		System.out.println("value="+value);
		System.out.println("ito="+ito);
		System.out.println("implicit="+implicit);
		System.out.println("eto="+eto);
		System.out.println("explicit="+explicit);
		
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicit));
		driver.findElement(By.id("MAHI"));
     }
}

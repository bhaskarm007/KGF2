package datadriventesting.excel;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Script to registration on page from ExcelLibrary
// everytime  it's wants new email id.
public class ExcelLibraryDataRegistor {

	public static void main(String[] args) {
		
		String sheetName = "Reg";
		int rowNumber =1;
		
		String name = ExcelLibrary.getStringData(sheetName, rowNumber, 0);
		String lastName = ExcelLibrary.getStringData(sheetName, rowNumber, 1);
		String email = ExcelLibrary.getStringData(sheetName, rowNumber, 2);
		String country = ExcelLibrary.getStringData(sheetName, rowNumber, 3);
		
		String cCode = ExcelLibrary.getStringData(sheetName, rowNumber, 4);
		String countryCode = cCode.split("\\.")[0];
		
		double phone = ExcelLibrary.getNumericData(sheetName, rowNumber, 5);
		String contact = BigDecimal.valueOf(phone).toString();
		
		String password = ExcelLibrary.getStringData(sheetName, rowNumber, 6);
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://shop-global.malaicha.com/registration");
		
		driver.findElement(By.name("firstName")).sendKeys(name);
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(email);
		
//	   driver.findElement(By.className("img")).click();
	   driver.findElement(By.className("option")).click();
	   driver.findElement(By.cssSelector("input[placeholder='Search..']")).sendKeys(country);
	   
	   List<WebElement> allCountryList = driver.findElements(By.cssSelector("li[class='trans-all']"));
	   for (WebElement ele : allCountryList) {
		String actualCountry = ele.getText();
		if(actualCountry.contains(countryCode) && actualCountry.contains(country)) {
			ele.click();
			break;
		}
	}
	   driver.findElement(By.name("mobileNumber")).sendKeys(contact);
	   driver.findElement(By.name("password")).sendKeys(password);
	   driver.findElement(By.name("confirmPassword")).sendKeys(password);
	   driver.findElement(By.name("tncAccepted")).click();
	   
	   driver.findElement(By.cssSelector("button[type='submit']")).click();
	   
	   String expectedUrl = ExcelLibrary.getStringData(sheetName, rowNumber, 7);
	   String actualUrl = driver.getTitle();
	   
	   if (actualUrl.equals(expectedUrl)) {
		System.out.println("Pass::malaicha Sign up page is verified and found Correct");
	} else {
		System.out.println("Fail::malaicha Sign up page is verified and found InCorrect");
	}
	   
	   driver.findElement(By.xpath("//button[text()='Start Shopping']")).click();
	}
}

/*Name	LastName	Email	  Country	CountryCode  Contact	Password	 ActualUrl
 Mahi	  bh	  canikissyou  India       91       9066678326  Testing@123  https://shop-global.malaicha.com/
 				  darling23													 registration-success
                  @gmail.com	
               				
*/


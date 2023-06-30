package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Brands {
	public static void main(String[] args) throws InterruptedException {  
		
		 // Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Create a new instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 // Navigate to the website
		driver.get("https://automationexercise.com/products");
		Thread.sleep(5000);
		
		

		        // Click on the "Brands" category
		        WebElement brandsCategory = driver.findElement(By.className("brands-name"));
		        //Thread.sleep(2000);
		        brandsCategory.click();

		        // Wait for the page to load
		       
		        try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        // Get the total number of items
		        WebElement totalItemsElement = driver.findElement(By.cssSelector("ul[class='nav nav-pills nav-stacked']"));
		        String totalItemsText = totalItemsElement.getText();
		        
		     // Remove non-numeric characters from the string
		        totalItemsText = totalItemsText.replaceAll("[^0-9]", "");
		        
		        int totalItems = Integer.parseInt(totalItemsText);
		        

		        // Print the total number of items
		        System.out.println("Total number of items in the 'Brands' category: " + totalItems);

		        // Close the browser
		        driver.quit();
		    }
		}

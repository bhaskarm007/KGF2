package pom.stage3.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.stage3.pageobjects.DashboardPage;
import pom.stage3.pageobjects.HomePage;
import pom.stage3.pageobjects.LoginPage;
import pom.stage3.pageobjects.OrderDetailsPage;
import pom.stage3.pageobjects.ProductDetailsPage;
import pom.stage3.pageobjects.ProductsPage;

public class TC001VerifyProductInODP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com/");
		
		LoginPage loginPage = new DashboardPage(driver).clickonSignInLink();
		HomePage homePage = loginPage.login("canikissyoudarling23@gmail.com", "Testing@123");
		ProductsPage productsPage = homePage.clickonMenu("Women");
		ProductsPage product = homePage.clickonMenu("Dress ");
		ProductDetailsPage productDetailsPage = productsPage.clickOnProduct("3");
        OrderDetailsPage orderDetailsPage = productDetailsPage.addToKart(6, 3, "M", "Pink");
        if (orderDetailsPage.isProductDisplayed("3")) {
			System.out.println("PASS:: Product is Displayed in ODP(Order Details Page)");
		} else {
            System.out.println("FAIL:: Product is Not Displayed in ODP(Order Details Page)");
		}
		homePage.getSignOutLink().click();
		driver.quit();
		
	}
}

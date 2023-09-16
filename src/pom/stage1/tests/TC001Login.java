package pom.stage1.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.stage1.page.HomePage;
import pom.stage1.page.LoginPage;

// Script to using LoginWebPage using POM
public class TC001Login {
    public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.actitime.com");
    
    LoginPage lp = new LoginPage();
    PageFactory.initElements(driver, lp);
    lp.getUsernameTextField().sendKeys("Mahi");
    driver.navigate().refresh();
    
    lp.getUsernameTextField().sendKeys("admin");
    lp.getPasswordField().sendKeys("manager");
    lp.getLoginButton().click();
    
    HomePage hp = new HomePage();
    PageFactory.initElements(driver, hp);
    hp.getLogoutLink().click();
    
    }  
}

package pom.stage3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	@FindBy (linkText = "Signup / Login")
	private WebElement signInlink;

	public WebElement getSignInlink() {
		return signInlink;
	}
	
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage clickonSignInLink() {
		jse.executeScript("arguments[0].click();",signInlink);
		return new LoginPage(driver);
	}
	
}

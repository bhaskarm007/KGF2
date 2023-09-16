package pom.stage2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Script to understand POM Stage2
public class LoginPage {

	@FindBy (name = "username")
	private WebElement usernameTextField;
	
	@FindBy (name = "password")
	private WebElement PasswordField;
//	
	@FindBy  (css ="button[type='submit']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void login(String usernameData, String passwordData) {
		usernameTextField.sendKeys(usernameData);
		PasswordField.sendKeys(passwordData);
		loginButton.click();
	}
}

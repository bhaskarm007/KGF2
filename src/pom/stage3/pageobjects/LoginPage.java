package pom.stage3.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(name = "email")
	private WebElement emailTextField;
	
	@FindBy (name= "password")
	private WebElement passwordTextField;
	
	@FindBy ( xpath= "//button[text()='Login']")
	private WebElement signInButton;
//	
//
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordField() {
		return passwordTextField;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}
	
//
	 public LoginPage(WebDriver driver) {
			super(driver);
		}
//	 
	public HomePage login(String emailId, String passwordData) {
		emailTextField.sendKeys(emailId);
		passwordTextField.sendKeys(passwordData);
		signInButton.click();
		return new HomePage(driver);
	   }
     }

package pom.stage1.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Script to Understand LoginPage POM Stage 1
public class LoginPage {
         @FindBy (id ="username")
         private WebElement usernameTextField;
         
         @FindBy (name = "pwd")
         private WebElement passwordField;
         
         @FindBy (id = "loginButton")
         private WebElement loginButton;
         
         @FindBy (id = "keepLoggedInCheckBox")
         private WebElement rememberCheckBox;

		public WebElement getUsernameTextField() {
			return usernameTextField;
		}

		public WebElement getPasswordField() {
			return passwordField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getRememberCheckBox() {
			return rememberCheckBox;
		}
         
}

package pom.findAll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindAll({@FindBy(id="u_0_5_mp"), @FindBy(name="login")})
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}

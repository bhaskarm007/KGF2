package pom.findBys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage {

	@FindBys({@FindBy(id="reg_box"), @FindBy(name="firstname")})
	private WebElement firstName;
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {  
		return firstName;
	}
}

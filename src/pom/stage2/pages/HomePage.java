package pom.stage2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (linkText = "Buzz")
	private WebElement buzzTab;
	
//	@FindBy (className = "oxd-userdropdown-tab")
	@FindBy (css = "span[class='oxd-userdropdown-tab']")
	private WebElement menuContainer;
	
	@FindBy (linkText = "Logout")
	private WebElement logoutLink;

//	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	
	public WebElement getBuzzTab() {
		return buzzTab;
	}

	public WebElement getMenuContainer() {
		return menuContainer;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
//
	public void logout() {
		menuContainer.click();
		logoutLink.click();
	}
}

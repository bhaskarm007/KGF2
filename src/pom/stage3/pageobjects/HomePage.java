package pom.stage3.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(linkText = "Sign out")
	private WebElement signOutLink;
	
//	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li/a")
//	@FindBy(xpath="//div[contains(@class,'panel-collapse collapse')]//ul/li/a")
	@FindBy(xpath="//a[contains(@data-toggle,'collapse')]")
	private WebElement menuLink;
	
	@FindBy(xpath ="//div[@id='Women']//ul/li/a")
	private List<WebElement> menuLinkList;
//
	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public WebElement getMenuLink() {
		return menuLink;
	}

	public List<WebElement> getMenuLinkList() {
		return menuLinkList;
	}
	
//
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
//	
	public ProductsPage clickonMenu(String menuName) {
		for(WebElement ele:menuLinkList) {
			if(ele.getText().equalsIgnoreCase(menuName)) {
				ele.click();
				return new ProductsPage(driver);
			}
		}
		return null;
	}
}

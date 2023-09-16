package pom.stage3.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends BasePage {

	@FindBy(xpath = "//td[@class='cart_product']/a")
	private List<WebElement> allProductsList;
//	
	public List<WebElement> getAllProductsList() {
		return allProductsList;
	}
//
	public OrderDetailsPage(WebDriver driver) {
		super(driver);	
	}
//	
	public boolean isProductDisplayed(String productId) {
		productId = "id_product="+productId;
		for(WebElement ele:allProductsList) {
			if(ele.getAttribute("href").contains(productId)) {
				return true;
			}
		}
		return false;
	}
}

package pom.stage3.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

	@FindBy(xpath ="//a[text()=' Products']")
	private  List<WebElement> allProductsList;
	
	public List<WebElement> getAllProductsList() {
		return allProductsList;
	}
	
//
	public ProductsPage(WebDriver driver) {
		super(driver);
	}
//
	public ProductDetailsPage clickOnProduct(String productId) {
		productId = "data-product-id="+productId;
		for (WebElement ele : allProductsList) {
			if(ele.getAttribute("href").contains(productId)) {
				jse.executeScript("arguments[0].click();", ele);
				return new ProductDetailsPage(driver);
			}
		}
		return null;
	}
	
	
}

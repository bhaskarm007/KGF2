package pom.stage3.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailsPage extends BasePage {

	@FindBy(className = "icon-plus")
	private WebElement plusIcon;
	
	@FindBy(className = "icon-minus")
	private WebElement minusIcon;

	@FindBy(id="group_1")
	private WebElement sizeListBox;
	
	@FindBy(xpath = "//ul[@id='color_to_pick_list']/li/a")
	private List<WebElement> colorPickerList;
	
	@FindBy(name = "Submit")
	private WebElement addToKartButton;
	
	@FindBy(linkText ="Proceed to checkout")
	private WebElement proceedToCheckOutButton;

//	
//
	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getMinusIcon() {
		return minusIcon;
	}

	public WebElement getSizeListBox() {
		return sizeListBox;
	}

	public List<WebElement> getColorPickerList() {
		return colorPickerList;
	}

	public WebElement getAddToKartButton() {
		return addToKartButton;
	}

	public WebElement getProceedToCheckOutButton() {
		return proceedToCheckOutButton;
	}
	
//
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}
//
	public void clickPlusIcon(int plusCount) {
		for (int i = 1; i <=plusCount; i++) {
			plusIcon.click();
		}
	}
//
	public void clickMinusIcon(int minusCount) {
		for (int i = 1; i <=minusCount; i++) {
			minusIcon.click();
		}
	}
//
	public void selectSize(String size) {
		Select s = new Select (sizeListBox);
		s.selectByVisibleText(size);
	}
//
	public void clickOnColor(String colorName) {
		for (WebElement ele : colorPickerList) {
			if(ele.getAttribute("name").equalsIgnoreCase(colorName)) {
				ele.click();
				break;
			}
		}	
	}
//	
	  public OrderDetailsPage addToKart(int plusCount, int minusCount, String size, String colorName) {
	      clickPlusIcon(plusCount);
	      clickMinusIcon(minusCount);
	      selectSize(size);
	      clickOnColor(colorName);
	      addToKartButton.click();
	      proceedToCheckOutButton.click();
	      return new OrderDetailsPage(driver);	
	}
}

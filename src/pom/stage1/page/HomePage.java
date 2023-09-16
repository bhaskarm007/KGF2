package pom.stage1.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Script to Understand HomePage POM 
public class HomePage {
@FindBy (id = "logoutLink")
private WebElement logoutLink;

@FindBy (linkText ="Users")
private WebElement usersLink;

@FindBy (linkText = "Reports")
private WebElement reportsLink;

public WebElement getLogoutLink() {
	return logoutLink;
}

public WebElement getUsersLink() {
	return usersLink;
}

public WebElement getReportsLink() {
	return reportsLink;
}

}

package ObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages {

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login;

	WebDriver page;

	public pages(WebDriver page) {
		this.page = page;
		PageFactory.initElements(page, this);
	}

	void enterUsername(String username) {
		userName.sendKeys("standard_user");
	}

	void enterPassword(String pass) {
		password.sendKeys("secret_sauce");
	}

	void clickLogin() {
		login.click();

	}
	// properties
	// web elements
	// username
	// password
	// image

	// methods
	// enter username
	// enter password
	// check presence the logo
	// click the login button

}

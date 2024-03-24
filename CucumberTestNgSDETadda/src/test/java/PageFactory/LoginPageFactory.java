package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement emailImputField;

	@FindBy(id = "password")
	WebElement passwordInputField;

	@FindBy(id = "login-button")
	WebElement logInButtonElement;

	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement logo;

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String userName) {
		emailImputField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordInputField.sendKeys(password);
	}

	public void clicklogin() {
		logInButtonElement.click();
	}

	public boolean isLogoPresent() {
		return logo.isDisplayed();
	}
}

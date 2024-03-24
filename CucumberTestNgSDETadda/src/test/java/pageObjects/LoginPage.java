package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	WebDriver driver;

	By userNameField = By.id("user-name");

	By passwordField = By.id("password");

	By loginButon = By.id("login-button");

	By logo = By.xpath("//div[@class='app_logo']");

	public void enterUserName(String userName) {
		driver.findElement(userNameField).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickLogIn() {
		driver.findElement(loginButon).click();
	}

	public boolean isLogoPresent() {
		return driver.findElement(logo).isDisplayed();
	}
}

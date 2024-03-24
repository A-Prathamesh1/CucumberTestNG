package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;

	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement logo;

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("page factory initialized");
	}
}

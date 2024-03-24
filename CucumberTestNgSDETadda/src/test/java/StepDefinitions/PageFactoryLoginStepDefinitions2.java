package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageFactory.HomePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.*;

public class PageFactoryLoginStepDefinitions2 {
	public static WebDriver driver;
	LoginPageFactory lp;
	HomePageFactory hp;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String userName, String password) {
		lp = new LoginPageFactory(driver);
		lp.enterUserName(userName);
		lp.enterPassword(password);
		// driver.findElement(By.id("user-name")).sendKeys(userName);
		// driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		lp.clicklogin();
		// driver.findElement(By.id("login-button")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
//		int count = driver.findElements(By.xpath("//div[@class=\"app_logo\"]")).size();
//		Assert.assertEquals(count, 1);
		hp = new HomePageFactory(driver);
		Assert.assertTrue(hp.isLogoDisplayed());
	}

	@And("closes browser")
	public void closes_browser() {
		driver.quit();
	}
}

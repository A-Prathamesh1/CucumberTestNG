//package StepDefinitions;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LoginPage;
//
//public class POMLoginStepDefintions {
//	public WebDriver driver;
//	LoginPage lp;
//
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.saucedemo.com/v1/");
//	}
//
//	@When("user enters valid {string} and {string}")
//	public void user_enters_valid_username_and_password(String userName, String password) {
//		lp = new LoginPage(driver);
//		lp.enterUserName(userName);
//		lp.enterPassword(password);
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//		lp.clickLogIn();
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		Assert.assertTrue(lp.isLogoPresent());
//	}
//
//	@And("closes browser")
//	public void closes_browser() {
//		driver.quit();
//	}
//}

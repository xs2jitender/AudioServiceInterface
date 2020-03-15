package StepDefinitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.LoginStepsPage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    private WebDriverWait wait;
    public LoginStepsPage login = new LoginStepsPage();

	@Given("^I am on the login page$")
	public void i_am_on_the_login_page() {
	    
	}

	@When("^I type in username (.*)$")
	public void i_type_in_username(String username) {
	        login.loginPageIsDisplayed();
	        login.fillUserNameData(username);
	}

	@And("^I type password as (.*)$")
	public void i_type(String password) {
        login.loginPageIsDisplayed();
        login.fillPasswordData(password);
	}

	@When("^click on login button$")
	public void click_on_login_button() {
		login.clickLoginInButton();
	}

	@Then("^I successfully login and land on homepage displaying Dashboard page$")
	public void i_successfully_login_and_land_on_homepage_displaying_Dashboard_page() {
		login.IsSuccessfullyLoggedIn();
	}

}
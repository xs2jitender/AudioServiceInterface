package StepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.InputsStepsPage;
import PageObjects.LoginStepsPage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InputsSteps {
	
	
	private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;
    private Select selectfromdropdown;
    InputsStepsPage addinputs = new InputsStepsPage(driver, wait);
    LoginSteps loginSteps = new LoginSteps();
    
    public InputsSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
    }
	
	@Given("^I am on the dashbaord page$")
	public void i_am_on_the_dashbaord_page() {
		loginSteps.i_am_on_the_login_page();
		loginSteps.i_type_in_username("admin");
		loginSteps.i_type("admin");
		loginSteps.click_on_login_button();	   
	}

	@When("^I click on the input link on the left panel$")
	public void i_click_on_the_input_link_on_the_left_panel() {
	addinputs.addInput();
	  
	}

	@Then("^I should be seeing the sources link on the main panel to add inputs$")
	public void i_should_be_seeing_the_sources_link_on_the_main_panel_to_add_inputs() throws Throwable {
	addinputs.addInput();
		         
	}

	@Given("^I click on the main panel of the dashboard page$")
	public void i_click_on_the_main_panel_of_the_dashboard_page() throws Throwable {
	    
	}

	@When("^I click on new source tab$")
	public void i_click_on_new_source_tab() throws Throwable {
		
	addinputs.addInput();
		        
	    
	}

	@Then("^the dropdowm menu should be displayed$")
	public void the_dropdowm_menu_should_be_displayed() {
		
		
		
		}

	
	
	@Given("^I click on the add new source tab on the main panel$")
	public void I_click_on_the_add_new_source_tab_on_the_main_panel() {
	addinputs.addInput();
	}
	
	
	@When("^the dialog box opens$")
	public void the_dialog_box_opens() {
			
	}
	
	@Then("^I add a user friendly name (.*)$")
	
	public void i_add_a_user_friendly_name(String Name) {
		
	addinputs.addFriendlyName(Name);

		
	}
		
	
	@And("^I choose source type from the dropdown menu (.*)$")
	
	public void I_choose_source_type_from_the_dropdown_menu(WebElement element, String SourceType) {
	
	addinputs.selectSourceType(element, selectfromdropdown, SourceType);	
		
		
	}
	
	
	@And("^I add the url (.*)$")
	public void I_add_the_url(String URL) {

		addinputs.enterURL(URL);
		
		 
	}

	@And("^I click on save button$")
	public void I_click_on_save_button(String URL) {
		addinputs.clickOnSaveButton();
	
	
	}
		
	}




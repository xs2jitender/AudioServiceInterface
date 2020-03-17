package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class InputsStepsPage extends BaseClass {

    public InputsStepsPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

	@FindBy(xpath = "//a[@href='/inputs']")
    @CacheLookup
    private WebElement clickOnInput;

    @FindBy(xpath = "//button[@id='btn_add_source']")
    @CacheLookup
    private WebElement clickOnNewSourceButton;

    @FindBy(xpath = "//button[@id='btn_add_source']")
    @CacheLookup
    private WebElement clickonNewSourcebutton;

	@FindBy(xpath = " //input[@id='ns_source_name']")
    @CacheLookup
    private WebElement addFriendlyName;

    @FindBy(xpath = "//select[@id='ns_source_type']")
    @CacheLookup
    private WebElement selectSourceType;

    @FindBy(xpath = "//input[@id ='ns_source_url']")
    @CacheLookup
    private WebElement enterURL;

    @FindBy(xpath = "//button[@id='btn_create_source']")
    @CacheLookup
    private WebElement clickonSaveButton;
    
    public void addInput() {
        clickOnInput.isDisplayed();
        System.out.println("FOUND ELEMENT");
        WaitUntilElementVisible(clickOnInput);
        clickOnInput.isDisplayed();
        clickOnInput.click();
        WaitUntilElementVisible(clickonNewSourcebutton);
        clickonNewSourcebutton.isDisplayed();
        clickonNewSourcebutton.click();

    }
    
    public void addFriendlyName(String Name) {
        WaitUntilElementVisible(addFriendlyName);
        addFriendlyName.isDisplayed();
        addFriendlyName.clear();
        addFriendlyName.sendKeys(Name);
    }

    public void selectSourceType(WebElement element, Select selectfromdropdown, String URL) {
    	WaitUntilElementVisible(selectSourceType);
    	selectSourceType.isDisplayed();
    	selectSourceType.click();
    	selectfromdropdown.selectByValue(URL);
    }
    
    public void enterURL(String URL) {
        WaitUntilElementVisible(enterURL);
        enterURL.clear();
        enterURL.sendKeys(URL);
    }

    public void clickOnSaveButton() {
        WaitUntilElementVisible(clickonSaveButton);
        clickonSaveButton.isEnabled();
        clickonSaveButton.click();
    }

}
    
    
    
	
       
    



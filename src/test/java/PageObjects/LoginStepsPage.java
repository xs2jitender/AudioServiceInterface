package PageObjects;


import base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginStepsPage extends BaseClass {

    public LoginStepsPage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(xpath = "//input[@id='username']")
    @CacheLookup
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id = 'btn_login']")
    @CacheLookup
    private WebElement LogInButton;

    public void fillUserNameData(String userName) {
        WaitUntilElementVisible(userNameField);
        userNameField.isEnabled();
        userNameField.clear();
        userNameField.sendKeys(userName);
    }

    public void fillPasswordData(String password) {
        WaitUntilElementVisible(passwordField);
        passwordField.isEnabled();
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickLoginInButton() {
        WaitUntilElementVisible(LogInButton);
        LogInButton.isEnabled();
        LogInButton.click();
    }

    
    public boolean loginPageIsDisplayed() {
        WaitUntilElementVisible(userNameField);
        userNameField.isDisplayed();
        WaitUntilElementVisible(passwordField);
        passwordField.isDisplayed();
        WaitUntilElementVisible(LogInButton);
        LogInButton.isDisplayed();
        return true;
    }

    public void IsSuccessfullyLoggedIn() {
            String actualhomepageURL = getWebDriver().getCurrentUrl();
            String expectedhomepageURL = "https://192.168.1.146:4443/";
            Assert.assertEquals(expectedhomepageURL, actualhomepageURL);
            assertTrue(true);
    }
}

package PageObjects;

import base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSteps extends BaseClass {

    public GoogleSteps() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "result-stats") @CacheLookup
    private WebElement elementResultStats;

    @FindBy(name = "q") @CacheLookup
    private WebElement elementSearchBox;


    public void openHomePage() {
        getWebDriver().get("https://google.com/");
    }

    public void search(String searchString) {
        elementSearchBox.sendKeys(searchString);
        new Actions(getWebDriver()).sendKeys(Keys.ENTER).perform();
    }

    public void checkResultsAreMoreThan(int numberOfResults) {
        String actualNumberOfResultsString = elementResultStats.getText();
        int endOfSubString = actualNumberOfResultsString.indexOf("results");
        String resultNumberAsString = actualNumberOfResultsString.substring(6,endOfSubString-1).replaceAll(",","");
        Long actualNumberOfResults = Long.valueOf(resultNumberAsString);
        Assert.assertTrue(actualNumberOfResults > numberOfResults);
    }
}

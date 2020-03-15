package StepDefinitions;

import base.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class Hooks {

    @After
    public void embedScreenshot(Scenario scenario) {
        if(scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) BaseClass.getWebDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        BaseClass.getWebDriver().quit();
    }
}



package base;

import Utilities.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static final Thread KILL_BROWSER_AT_END = new Thread() {
        @Override
        public void run() {
            getWebDriver().quit();
        }
    };

    public BaseClass() {
        if (driver == null) {
            startDriver();
        }
        wait = new WebDriverWait(driver, PropertiesReader.getTimeout());
    }

    private void startDriver() {
        System.out.println("Starting webdriver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(PropertiesReader.getValue("url"));
        Runtime.getRuntime().addShutdownHook(KILL_BROWSER_AT_END);
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    protected void WaitUntilElementVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public void selectDropDownValue(WebElement element, String value) {
        Select selectFromDropdown = new Select(element);
        selectFromDropdown.selectByVisibleText(value);
    }
}


package base;

import Utilities.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BaseClass {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public BaseClass() {
        startDriver();
        wait = new WebDriverWait(driver, PropertiesReader.getTimeout());
    }

    private void startDriver() {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        driver = new ChromeDriver(options);
////        driver.manage().timeouts().implicitlyWait(PropertiesReader.getTimeout(), TimeUnit.SECONDS);
////        driver.manage().timeouts().setScriptTimeout(PropertiesReader.getTimeout(), TimeUnit.SECONDS);
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(PropertiesReader.getValue("url"));
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


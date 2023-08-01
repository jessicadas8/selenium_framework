package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumFramework.DriverManager;
import org.seleniumFramework.pojos.Configs;
import org.seleniumFramework.utils.FileUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.IOException;
import static org.seleniumFramework.ExtentReport.*;


public class Page {

    public static Configs testConfigs;
    DriverManager driver = new DriverManager();

    @BeforeSuite
    public void setUpWebDriver() throws IOException {
        driver.chromeDriverInitialization();
        testConfigs = FileUtils.getTestConfigsFromJson();
    }

    //TODO: move below functions to wrappers
    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }

    public void typeIntoTextField(String text, By locator) {
        WebElement userName = driver.getDriver().findElement(locator);
        userName.sendKeys(text);
    }

    public void clickButton(By locator) {
        WebElement clickBtn = driver.getDriver().findElement(locator);
        clickBtn.click();
    }

    @AfterSuite
    public void cleanUp() {
        extentReports.flush();
        //driver.getDriver().quit();
    }
}



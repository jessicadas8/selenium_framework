package org.seleniumFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.seleniumFramework.ExtentReport.setupReport;


public class DriverManager {

    public static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void chromeDriverInitialization() {
        setupReport();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}

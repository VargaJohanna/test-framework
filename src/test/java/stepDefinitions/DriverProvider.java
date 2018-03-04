package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class DriverProvider {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        if(wait == null) {
            wait = new WebDriverWait(getDriver(), 40);
        }
        return wait;
    }

    public void quit() {
        driver.quit();
        driver = null;
    }
}

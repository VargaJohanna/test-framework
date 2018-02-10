package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BaseStep {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 40);

    @Before
    public void setup() {
        driver.get("https://www.jetbrains.com/");
    }

    @After
    public void closeUp() {
        driver.quit();
    }
}

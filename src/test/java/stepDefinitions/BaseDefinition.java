package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePage;

abstract class BaseStep {
    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 40);
    HomePage home = PageFactory.initElements(driver, HomePage.class);

    @Before
    public void setup() {
        driver.get("https://www.jetbrains.com/");
        home.closeCookieBanner();
    }

    @After
    public void closeUp() {
        driver.quit();
    }
}

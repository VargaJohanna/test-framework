package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.DriverProvider;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePage;

public class BeforeAfter extends DriverProvider {
    HomePage home = PageFactory.initElements(getDriver(), HomePage.class);

    @Before
    public void setup() {
        getDriver().get("https://www.jetbrains.com/");
        home.closeCookieBanner();
    }

    @After
    public void closeUp() {
        quit();
    }
}

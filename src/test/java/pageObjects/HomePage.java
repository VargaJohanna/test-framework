package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = ".cookies-banner__close-button")
    public WebElement cookieCloseButton;

    public HomePage closeCookieBanner() {
        cookieCloseButton.click();
        return new HomePage(driver);
    }
}

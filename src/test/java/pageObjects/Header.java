package pageObjects;

import helpers.ActionMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header {
    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = ".header")
    private WebElement header;

    @FindBy(css = "a[data-popover-group-button-id='header-navigation-tools']")
    private WebElement toolsMenu;

    @FindBy(css = "a[href='/idea/?fromMenu']")
    private WebElement ideaLink;

    @FindBy(css = ".js-header-popover-hover._active")
    private WebElement menuOnHover;

    public Header hoverTools(WebDriverWait wait) {
        ActionMethods.getInstance().moveToElement(driver, toolsMenu);
        wait.until(ExpectedConditions.visibilityOf(menuOnHover));
        return new Header(driver);
    }

    public IdeaPage clickIdea() {
        ideaLink.click();
        return new IdeaPage(driver);
    }

}

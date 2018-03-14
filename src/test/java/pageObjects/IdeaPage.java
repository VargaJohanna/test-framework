package pageObjects;

import helpers.ScrollMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IdeaPage {
    private WebDriver driver;

    public IdeaPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = ".button._icon-video._dark.js-popup.fs-lightbox-element")
    private WebElement playButton;

    @FindBy(tagName = "iframe")
    public WebElement iframe;

    @FindBy(css = ".html5-video-player.playing-mode")
    public WebElement playingVideo;

    @FindBy(css = ".header-secondary__title")
    public WebElement secondaryTitle;

    public IdeaPage playVideo() {
        playButton.click();
        return new IdeaPage(driver);
    }
}

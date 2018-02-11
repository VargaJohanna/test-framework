package stepDefinitions;

import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.Header;
import pageObjects.IdeaPage;

public class IntelliJSteps extends BaseStep implements En {
    Header header = PageFactory.initElements(driver, Header.class);
    IdeaPage idea = PageFactory.initElements(driver, IdeaPage.class);

    public IntelliJSteps() {
        Given("^that I'm on the IntelliJ Idea page$", () -> {
            header.hoverTools(wait);
            header.clickIdea();
        });

        When("^I click on the video$", () -> {
            idea.playVideo();
        });

        Then("^the video plays$", () -> {
            wait.until(ExpectedConditions.visibilityOf(idea.iframe));
            driver.switchTo().frame(0);
            wait.until(ExpectedConditions.visibilityOf(idea.playingVideo));
        });
    }
}

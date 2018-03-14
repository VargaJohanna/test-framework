package stepDefinitions;

import cucumber.api.java8.En;
import helpers.DriverProvider;
import helpers.TestData;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.Header;
import pageObjects.IdeaPage;

import static helpers.DriverProvider.getDriver;
import static helpers.DriverProvider.getWait;

public class IntelliJSteps implements En {
    private TestData data;

    public IntelliJSteps(TestData data) {
        this.data = data;
        Header header = PageFactory.initElements(getDriver(), Header.class);
        IdeaPage idea = PageFactory.initElements(getDriver(), IdeaPage.class);

        Given("^that I'm on the IntelliJ Idea page$", () -> {
            header.hoverTools(getDriver(), getWait());
            header.clickIdea();
        });

        When("^I click on the video$", () -> idea.playVideo());

        Then("^the video plays$", () -> {
            getWait().until(ExpectedConditions.visibilityOf(idea.iframe));
            getDriver().switchTo().frame(0);
            getWait().until(ExpectedConditions.visibilityOf(idea.playingVideo));
        });
    }
}
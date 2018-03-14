package stepDefinitions;

import cucumber.api.java8.En;

import static helpers.DriverProvider.getDriver;
import static helpers.DriverProvider.getWait;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import helpers.TestData;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Header;
import pageObjects.IdeaPage;

public class HeaderSteps implements En {
    public TestData data;
    private Header header = PageFactory.initElements(getDriver(), Header.class);
    IdeaPage idea = PageFactory.initElements(getDriver(), IdeaPage.class);

    public HeaderSteps(TestData data) {
        this.data = data;
        Given("^that I click on the Tools menu$", () -> {
            header.hoverTools(getDriver(), getWait());
        });

        When("^I click on the IntelliJ IDEA item$", () -> {
            data.setMenuText(header.ideaLink.getText());
            header.clickIdea();
        });

        Then("^I'm taken to the idea page", () -> {
            assertThat(getDriver().getCurrentUrl(),
                    containsString("/idea/?fromMenu"));
            assertThat(idea.secondaryTitle.getText(), containsString(data.getMenuText()));
        });
    }
}

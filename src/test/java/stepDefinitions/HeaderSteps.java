package stepDefinitions;

import cucumber.api.java8.En;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static stepDefinitions.DriverProvider.getDriver;
import static stepDefinitions.DriverProvider.getWait;

import org.openqa.selenium.support.PageFactory;
import pageObjects.Header;

public class HeaderSteps implements En {
    private Header header = PageFactory.initElements(getDriver(), Header.class);

    public HeaderSteps() {
        Given("^that I click on the Tools menu$", () -> header.hoverTools(getDriver(), getWait()));

        When("^I click on the IntelliJ IDEA item$", () -> header.clickIdea());

        Then("^I'm taken to the idea page", () -> assertThat(getDriver().getCurrentUrl(),
                containsString("/idea/?fromMenu")));
    }
}

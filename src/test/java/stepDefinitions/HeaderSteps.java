package stepDefinitions;

import cucumber.api.java8.En;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.openqa.selenium.support.PageFactory;
import pageObjects.Header;

public class HeaderSteps extends BaseStep implements En {
    private Header header = PageFactory.initElements(driver, Header.class);

    public HeaderSteps() {
        Given("^that I click on the Tools menu$", () -> header.hoverTools(wait));

        When("^I click on the IntelliJ IDEA item$", () -> header.clickIdea());

        Then("^I'm taken to the idea page", () -> assertThat(driver.getCurrentUrl(),
                containsString("/idea/?fromMenu")));
    }
}

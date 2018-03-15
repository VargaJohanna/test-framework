package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static helpers.DriverProvider.getDriver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DownloadSteps implements En {
    public DownloadSteps() {
        Then("^I'm taken to the download page$", () -> {
            assertThat(getDriver().getCurrentUrl(),
                    containsString("idea/download/"));
        });
    }
}

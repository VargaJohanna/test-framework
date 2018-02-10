package utils;
import cucumber.api.CucumberOptions;

@CucumberOptions(
        glue = "java/stepDefinitions",
        features = "java/features",
        plugin = {"pretty"},
        tags = {"~@ignore"})

public class CucumberRunner {
}

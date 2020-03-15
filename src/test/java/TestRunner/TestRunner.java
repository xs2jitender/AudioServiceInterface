package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        tags = {"@testing"},
        plugin = {
                    "pretty",
                    "json:target/cucumber.json",
                    "html:target/cucumber-reports-junit"},
                    monochrome = true
)
public class TestRunner {
}



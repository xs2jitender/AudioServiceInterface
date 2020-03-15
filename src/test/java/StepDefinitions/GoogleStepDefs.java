package StepDefinitions;

import PageObjects.GoogleSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDefs
{
    GoogleSteps googleSteps = new GoogleSteps();

    @Given("google.com is open")
    public void googleComIsOpen() {
        googleSteps.openHomePage();
    }

    @When("I search for (.*)")
    public void iSearchFor(String serachString) {
        googleSteps.search(serachString);
    }

    @Then("I see more then (.*) search results")
    public void iSeeMoreThenSearchResults(int numberOfResults) {
        googleSteps.checkResultsAreMoreThan(numberOfResults);
    }
}

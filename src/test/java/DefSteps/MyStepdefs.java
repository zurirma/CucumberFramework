package DefSteps;

import Paginas.GoogleSearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {


    GoogleSearchPage googleSearch = new GoogleSearchPage();

    @Given("^I am on the Google search page$")
    public void iAmOnTheGoogleSearchPage() {
        googleSearch.navigateToGoogle();
    }

    @When("^I enter a word in the search field:$")
    public void iEnterAWordInTheSearchField() {
        googleSearch.enterSearchCriteria("www.TheFreeRangeTester.com/n");
    }

    //@And("^click on the search button$")
   // public void clickOnTheSearchButton() {
    //    googleSearch.clickOnSearchGoogle();
   // }

    @Then("^I see results related to the word entered$")
    public void iSeeResultsRelatedToTheWordEntered() {

    }
}

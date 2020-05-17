package DefSteps;

import Paginas.AmazonSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {


    AmazonSearchPage amazonSearch = new AmazonSearchPage();


    //@Given("^I am on the Google search page$")
    //public void iAmOnTheGoogleSearchPage() {
    //    googleSearch.navigateToGoogle();
    //}

    //@When("^I enter a word in the search field:$")
    //public void iEnterAWordInTheSearchField() {
     //   googleSearch.enterSearchCriteria("www.TheFreeRangeTester.com/n");
    //}

    //@And("^click on the search button$")
   // public void clickOnTheSearchButton() {
    //    googleSearch.clickOnSearchGoogle();
   // }

    //@Then("^I see results related to the word entered$")
    //public void iSeeResultsRelatedToTheWordEntered() {

    //}

    @Given("^the user navigates to amazon.com$")
    public void theUserNavigatesToAmazonCom() {
        amazonSearch.navigateToAmazon();
    }

    @And("^Searches for Alexa$")
    public void searchesForAlexa() {
        amazonSearch.enterSearchCriteria("Alexa");
        amazonSearch.clickOnSearchButton();
    }

    @And("^navigates to the second page$")
    public void navigatesToTheSecondPage() {
        amazonSearch.clickOnPage();
    }

   @And("^selects the third item$")
   public void selectsTheThirdItem() {
      amazonSearch.selectItem();
    }

    //@Then("^assert that the item would be available for purchase")
    //public void assertThatTheItemWouldBeAvailableForPurchase() {
    //}
}

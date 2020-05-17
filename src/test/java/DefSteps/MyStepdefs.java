package DefSteps;

import Paginas.AmazonSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {


    AmazonSearchPage amazonSearch = new AmazonSearchPage();
    public static WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;


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
    public void navigatesToTheSecondPage() throws InterruptedException {
        Thread.sleep(2000);
        amazonSearch.clickOnPage();
    }

  // @And("^selects the third item$")
   //public void selectsTheThirdItem() {
     // amazonSearch.selectItem();
    //}

    //@Then("^assert that the item would be available for purchase")
    //public void assertThatTheItemWouldBeAvailableForPurchase() {
    //}
}

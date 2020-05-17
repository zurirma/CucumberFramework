package Paginas;

public class AmazonSearchPage extends BasePage {

    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']";
    private String secondPage = "//a[contains(text(),'2')]";
    private String thirdItem = "//span[contains(text(),'Fivoice WiFi Bluetooth Speaker Portable, Wireless')]";


    public AmazonSearchPage(){
        super(driver);
    }

    public void navigateToAmazon(){
        navigateTo( "https://www.amazon.com");
    }

    public void enterSearchCriteria(String searchText) { sendKeysTo (searchBox, searchText); }

    public void clickOnSearchButton() { clickElement(searchButton); }

    public void clickOnPage() { clickElement(secondPage);}

    public void selectItem() { clickElement(thirdItem);}


}

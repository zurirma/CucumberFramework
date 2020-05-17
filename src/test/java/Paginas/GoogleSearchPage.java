package Paginas;

public class GoogleSearchPage extends BasePage {

    private String searchBox = "//input[@title='Buscar']";
    private String searchButton = "//div[@class='FPdoLc VicLAe']//input[@value='Buscar con Google']";


    public GoogleSearchPage(){
        super(driver);
}

    public void navigateToGoogle(){
        navigateTo( "https://www.google.com");
    }

    public void enterSearchCriteria(String searchText) { sendKeysTo (searchBox, searchText); }

    public void clickOnSearchGoogle() { clickElement(searchButton); }




}

package GL.Cucumber.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.IntegralHelmetsProductList;
import pages.LogInPage;
import pages.MainPage;
import pages.MyPanelPage;
import pages.ProductPage;
import pages.ExampleProductPage;
import pages.IntegralHelmetProductPage;
import util.BasePage;
import util.Utils;
public class StepDefinitions {
	
	MainPage mainPage;
	LogInPage logInPage;
	MyPanelPage myPanelPage;
	IntegralHelmetsProductList integralHelmetsProductList;
	IntegralHelmetProductPage integralHelmetProductPage;
	ExampleProductPage productPage;
//  ------ Given ------

/*
 Gdyby @Before miało dotyczyć wybranego (-ych) scenariusza to tagujemy ("@TagName") albo:
 
 @BeforeStep
public void doSomethingBeforeStep(Scenario scenario){
 
 	
 */
@Before			
public void user_opens_Bikestar_page() throws Throwable {
	BasePage.initialize();
	mainPage = new MainPage();	

}

@Given("^Bikestar main page has opened$")
public void bikestar_main_page_has_opened() throws Throwable {
	assertEquals("Sklep Motocyklowy - Akcesoria i Części Motocyklowe - Bikestar.pl", mainPage.getTitle());  
}
// ------- When -------

@When("^User click login link$")
public void user_click_login_link() {
	mainPage.goToLoginPage();
}


@When("^User click login button$")
public void User_click_login_button() throws Throwable {
	logInPage.clickLoginButton(); 
}


@When("^User enter valid email and password$")

public void user_enter_valid_email_and_password(DataTable credentials) throws Throwable {
   
	for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {	
		
		logInPage.typeEmail((data.get("email")));
		logInPage.typePassword(data.get("password"));
		
	}
	Thread.sleep(2000);

}

@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String email, String password) throws Throwable {
  
	logInPage.typeEmail(email);
	logInPage.typePassword(password);
	
}


// --------- Then ----------

@Then("^login page is displayed$")
public void login_page_is_displayed() throws Throwable {
	logInPage = new LogInPage();
}

@When("^User logs in using valid credentials$")
public void user_logs_in_using_valid_credentials() throws Throwable {
    
	logInPage.typeEmail("leszek1502@gmail.com");
	logInPage.typePassword("haslo");
	logInPage.clickLoginButton();
}




@Then("^my panel page is opened at adress (.*)$")
public void my_panel_page_is_opened_at_adress(String adress) throws Throwable {
		
		System.out.println(adress);
		myPanelPage=new MyPanelPage();
		myPanelPage.checkAdress(adress);
	//	assertEquals((String)driver.getCurrentUrl(),adress);
	//"https://www.bikestar.pl/customer/account/"
}

@Then("^Welcome message \\\"([^\\\"]*)\\\" is displayed$")
public void Welcome_message_is_displayed(String message) throws Throwable {
	System.out.println(message);
	System.out.println(myPanelPage.getWelcomeMessage());
   assertEquals(myPanelPage.getWelcomeMessage(),message);
}

@Then("^Warning message \\\"([^\\\"]*)\\\" is displayed$")
public void Warning_message_is_displayed(String warning) throws Throwable {
	//System.out.println(driver.findElement(By.cssSelector(".error-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")).getText());
    System.out.println(warning);
    System.out.println(logInPage.getWarningMessage());
   assertEquals(logInPage.getWarningMessage(),warning);
}

//PAGE STRUCTURE
@When("^User checks if Ddl menu top of the page is visible$")
public void user_checks_if_Ddl_menu_top_of_the_page_is_visible() throws Throwable {
    mainPage.mouseOverMainMenuHelmets();
    mainPage.mouseOverMainMenuClothes();
    mainPage.mouseOverMainMenuGloves();
    //itd...
    mainPage.mouseOverMainMenuBlog();
}
@Then("^Ddl menu top of the page is visible$")
public void Ddl_menu_top_of_the_page_is_visible() throws Throwable {
    
	//
	assertTrue(mainPage.mainMenuHelmetsIsDisplayed());
	assertTrue(mainPage.mainMenuClothesIsDisplayed());
	assertTrue(mainPage.mainMenuGlovesIsDisplayed());
	//itd...
	//i tak przez wszystkie elementy, mozna tez jeszcze sprawdzac elementy podmenu          
    assertTrue(mainPage.mainMenuBlogIsDisplayed());
}
@When("^User checks if table menu bottom of the page is visible$")
public void user_checks_if_table_menu_bottom_of_the_page_is_visible() throws Throwable {
    mainPage.mouseOverTableMenu();
}


@Then("^table menu bottom of the page is visible$")
public void table_menu_bottom_of_the_page_is_visible() throws Throwable {
    
   assertTrue(mainPage.tableMenuIsDisplayed());
}

@When("^User checks if highlighted products are visible$")
public void user_checks_if_highlighted_products_are_visible() throws Throwable {
    mainPage.mouseOverHighlightedProducts();
}
@Then("^highlighted products are visible bottom of the page$")
public void highlighted_products_are_visible_bottom_of_the_page() throws Throwable {
    
    assertTrue(mainPage.highlightedProductsIsDisplayed());
}

@When("^user moves mouse over Helmets in menu$")
public void user_moves_mouse_over_Helmets_in_menu() throws Throwable {
	mainPage.mouseOverMainMenuHelmets();
	Thread.sleep(2000);

}

@Then("^sub menu is displayed$")
public void sub_menu_is_displayed() throws Throwable {
    
    mainPage.IntegralHelmetMenuItemIsDisplayed();
}

@When("^user clicks on integral helmets menu item$")
public void user_clicks_on_integral_helmets_menu_item() throws Throwable {
       mainPage.clickIntegralHelmetsMenuItem();
}

@Then("^product list of integral helmets is displayed$")
public void product_list_of_integral_helmets_is_displayed() throws Throwable {
	integralHelmetsProductList=new IntegralHelmetsProductList();
	assertEquals(integralHelmetsProductList.getTitle(),"Kaski Integralne zmknięte - Bikestar.pl");
    
	//TO DO : zrobic logike listy produktow
   
}

@When("^user clicks first highlighted product$")
public void user_clicks_first_highlighted_product() throws Throwable {
    
    mainPage.clickOnFirstHighlightedProduct();
    productPage= new ExampleProductPage();
	
}

@Then("^selected product page is displayed$")
public void selected_product_page_is_displayed() throws Throwable {
    
	assertTrue(productPage.addToCartButtonIsVisible());
	//TODO
	//poszukać elementów wspólnych, dzięki którym można potwierdzić otwarcie strony, lub wyciągnąć adres linku i sprawdzić czy przechodzi pod ten adres
   
}
@Then("^breadcrumbs trail is displayed on product list page$")
public void breadcrumbs_trail_is_displayed_on_product_list_page() throws Throwable {
    
	assertTrue(integralHelmetsProductList.breadcrumbsTrailIsDisplayed());
	//TO DO - sprawdzenie czy nawigacja wyswietla sie we wlasciwej formie 
	//"Strona główna / Typu produktu / Kategoria produktu (/ Podkategoria produktu)".
}

//Product Page
@When("^user clicks on first product$")
public void user_clicks_on_first_product() throws Throwable {
	
	integralHelmetsProductList.clickOnFirstIntegralHelmetLink();
	
   
}

@Then("^product page is displayed$")
public void product_page_is_displayed() throws Throwable {
    
	integralHelmetProductPage=new IntegralHelmetProductPage();
	assertEquals("Kask",integralHelmetProductPage.getTitle().substring(0, 4));
    
}
@Then("^breadcrumbs trail is displayed on product page$")
public void breadcrumbs_trail_is_displayed_on_product_page() throws Throwable {
    
	assertTrue(integralHelmetProductPage.breadcrumbsTrailIsDisplayed());
	//TO DO - sprawdzenie czy nawigacja wyswietla sie we wlasciwej formie 
	//"Strona główna / Typu produktu / Kategoria produktu (/ Podkategoria produktu)".
}



@After

public void closeDriver() {
	if(BasePage.driver!=null)
	BasePage.quitBrowser();
}


}
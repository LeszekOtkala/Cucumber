package GL.Cucumber.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LogInPage;
import pages.MainPage;
import pages.MyPanelPage;
import util.BasePage;
import util.Utils;
public class StepDefinitions {
	
	MainPage mainPage;
	LogInPage logInPage;
	MyPanelPage myPanelPage;
	
//  ------ Given ------
	
@Given("^User opens Bikestar page$")
public void user_opens_Bikestar_page() throws Throwable {
	BasePage.initialize();
	mainPage = new MainPage();	

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

    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
   // throw new PendingException();
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

@Then("^product is added to cart$")
public void product_is_added_to_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   throw new PendingException();
}



@Then("^Article is displayed$")
public void article_is_displayed() throws Throwable {
	throw new PendingException();
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
@Then("^Main Page is opened and ddl menu top of the page is visible$")
public void main_Page_is_opened_and_ddl_menu_top_of_the_page_is_visible() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	assertEquals("Sklep Motocyklowy - Akcesoria i Części Motocyklowe - Bikestar.pl", mainPage.getTitle());
	assertTrue(mainPage.mainMenuHelmetsIsDisplayed());
	assertTrue(mainPage.mainMenuClothesIsDisplayed());
	assertTrue(mainPage.mainMenuGlovesIsDisplayed());
	//itd...
	
	//i tak przez wszystkie elementy, mozna tez jeszcze sprawdzac elementy podmenu          
    //throw new PendingException();
}

@Then("^table menu bottom of the page is visible$")
public void table_menu_bottom_of_the_page_is_visible() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   assertTrue(mainPage.tableMenuIsDisplayed());
}

@Then("^highlighted products are visible bottom of the page$")
public void highlighted_products_are_visible_bottom_of_the_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    assertTrue(mainPage.highlightedProductsIsDisplayed());
}

@When("^user moves mouse over Helmets in menu$")
public void user_moves_mouse_over_Helmets_in_menu() throws Throwable {
	mainPage.mouseOverMainMenuHelmets();
	Thread.sleep(2000);
	/*
	mainPage.mouseOverMainMenuClothes();
	Thread.sleep(2000);
	mainPage.mouseOverMainMenuGloves();
	Thread.sleep(2000);
	*/
}

@Then("^sub menu is displayed$")
public void sub_menu_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    mainPage.IntegralHelmetMenuItemIsDisplayed();
}

@When("^user clicks on integral helmets menu item$")
public void user_clicks_on_integral_helmets_menu_item() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    mainPage.clickIntegralHelmetsMenuItem();
}

@Then("^product list of integral helmets is displayed$")
public void product_list_of_integral_helmets_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//TO DO : zrobic logike listy produktow
    throw new PendingException();
}

@When("^user clicks first highlighted product$")
public void user_clicks_first_highlighted_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^selected product page is displayed$")
public void selected_product_page_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
@Then("^breadcrumbs trail is displayed$")
public void breadcrumbs_trail_is_displayed() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	assertTrue(mainPage.breadcrumbsTrailIsDisplayed());
	//TO DO - sprawdzenie czy nawigacja wyswietla sie we wlasciwej formie 
	//"Strona główna / Typu produktu / Kategoria produktu (/ Podkategoria produktu)".
}

// END OF PAGE STRUCTURE

@After

public void closeDriver() {
	if(BasePage.driver!=null)
	BasePage.quitBrowser();
}


}
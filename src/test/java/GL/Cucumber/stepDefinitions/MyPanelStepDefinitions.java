package GL.Cucumber.stepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.AccountDataEditPage;
import pages.AddNewAddressPage;
import pages.AddressBookPage;
import pages.MainPage;
import pages.MyPanelPage;

public class MyPanelStepDefinitions {

	MainPage mainPage;
	MyPanelPage myPanelPage;
	AccountDataEditPage accountDataEditPage;
	AddressBookPage addressBookPage;
	AddNewAddressPage addNewAddressPage;
	AddNewAddressPage editAddressPage;
	
	@When("^User move mouse over Account DDL$")
	public void user_move_mouse_over_Account_DDL() throws Throwable {
	    
		mainPage=new MainPage();
		mainPage.mouseOverAccountDDL();
		Thread.sleep(2000);
	   
	}
	
	@When("^User click on My Account$")
	public void user_click_on_My_Account() throws Throwable {
	    
		mainPage.goToMyAccount();
		Thread.sleep(2000);
	    
	}
	@Then("^my panel page is opened$")
	public void my_panel_page_is_opened() throws Throwable {
	    
		myPanelPage=new MyPanelPage();
		
	    
	}

	@When("^user click account edit link$")
	public void user_click_account_edit_link() throws Throwable {
	   
		myPanelPage.goToAccountEdit();
	   
	}
	
	@Then("^account data edit page is opened$")
	public void account_data_edit_page_is_opened() throws Throwable {
	    accountDataEditPage=new AccountDataEditPage();
	    
	}


	@When("^user type name \"([^\"]*)\" to textbox name$")
	public void user_type_name_to_textbox_name(String name) throws Throwable {
		accountDataEditPage.clickOnFirstNameTextbox();
		accountDataEditPage.clearFirstNameTextbox();
		accountDataEditPage.enterFirstName(name);
		
		
	}
	

	@When("^user type name \"([^\"]*)\" to textbox surname$")
	public void user_type_name_to_textbox_surname(String surName) throws Throwable {
	    
		accountDataEditPage.clickOnSurNameTextbox();
		accountDataEditPage.clearSurNameTextbox();
	    accountDataEditPage.enterSurName(surName);
	}

	

	@When("^user type name \"([^\"]*)\" to textbox email$")
	public void user_type_name_to_textbox_email(String email) throws Throwable {
		accountDataEditPage.clickOnEmailTextbox();
		accountDataEditPage.clearEmailTextbox();
		accountDataEditPage.enterEmail(email);
	}

	@When("^user click Save button$")
	public void user_click_Save_button() throws Throwable {
	    
		accountDataEditPage.clickSaveButton();
	Thread.sleep(2000);    
	}
	@When("^user click on current password textfield$")
	public void user_click_on_current_password_textfield() throws Throwable {
	    
	    accountDataEditPage.clickOnCurrentPasswordTextBox();
	}

	@When("^user enter password: \"([^\"]*)\" to current password$")
	public void user_enter_password_to_current_password(String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		accountDataEditPage.enterCurrentPasswordTextBox(pass);
	}
	
	@When("^user enter password: \"([^\"]*)\" to confrm password textbox$")
	public void user_eter_password_to_confrm_password_textbox(String pass) throws Throwable {
		accountDataEditPage.clickOnConfirmCurrentPasswordTextBox();
	    accountDataEditPage.enterConfirmCurrentPasswordTextBox(pass);
	}

	@Then("^\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" is visible in user data fields$")
	public void is_visible_in_user_data_fields(String name, String surname, String email) throws Throwable {
	   
		Thread.sleep(5000);
		System.out.println(myPanelPage.getUserData());
		Assert.assertEquals(name+" "+surname+"\n"+email+"\n"+"Zmień hasło",myPanelPage.getUserData() );
	}
	@When("^user click adress book link$")
	public void user_click_adress_book_link() throws Throwable {
	    myPanelPage.goToAdressBook();
	    
	    
	}
	
	@When("^user clicks edit primary billing address$")
	public void user_clicks_edit_primary_billing_address() throws Throwable {
	    
		addressBookPage.clickOnEditPrimaryBillingAddress();

	}
	

	@Then("^addres book is opened or add new address page is opened$")
	
	public void addres_book_is_opened_or_add_new_address_page_is_opened() throws Throwable {
		Assert.assertTrue(myPanelPage.getPageTitle().equals("Książka adresowa - Bikestar.pl")||myPanelPage.getPageTitle().equals("Dodaj nowy adres - Bikestar.pl"));
	   
	    
	}
	@Then("^add new address page is opened$")
	public void add_new_address_page_is_opened() throws Throwable {
		//addressBookPage= new AddressBookPage(); //dla pierwszego otwarcia
		//addressBookPage.clickOnAddNewAdressLink(); //dla pierwszego otwarcia
		if(myPanelPage.getPageTitle().equals("Dodaj nowy adres - Bikestar.pl"));
		addNewAddressPage=new AddNewAddressPage();
	    
	}
	@Then("^addres book page is opened$")
	public void addres_book_page_is_opened() throws Throwable {
	   
		addressBookPage= new AddressBookPage();
		Assert.assertEquals("Książka adresowa - Bikestar.pl", addressBookPage.getPageTitle());
	}

	@When("^user clicks on add_new_addres button$")
	public void user_clicks_on_add_new_addres_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		addressBookPage.clickOnAddNewAdressLink();
	}


	@When("^user creates adress first time typing data:$")
	public void user_creates_adress_first_time_typing_data(DataTable addressData) throws Throwable {
		for(Map<String, String> data : addressData.asMaps(String.class, String.class)) {
		
		//System.out.println("Nazwisko to: "+data.get("surname"));	
			
		addNewAddressPage.clickOnFirstNameTextbox();
		addNewAddressPage.clearFirstNameTextbox();
		addNewAddressPage.enterFirstName(data.get("name")); 
		
		addNewAddressPage.clickOnSurNameTextbox();
		addNewAddressPage.clearSurNameTextbox();
		addNewAddressPage.enterSurName(data.get("surname"));
		
		addNewAddressPage.clickOnCompanyTextbox();
		addNewAddressPage.clearCompanyTextbox();
		addNewAddressPage.enterCompany(data.get("company"));
		
		addNewAddressPage.clickOnTelephoneTextbox();
		addNewAddressPage.clearTelephoneTextbox();
		addNewAddressPage.enterTelephone(data.get("tel"));
		
		addNewAddressPage.clickOnFaxTextbox();
		addNewAddressPage.clearFaxTextbox();
		addNewAddressPage.enterFax(data.get("fax"));
		
		addNewAddressPage.clickOnStreetTextbox();
		addNewAddressPage.clearStreetTextbox();
		addNewAddressPage.enterStreet(data.get("street"));
		
		addNewAddressPage.clickOnCityTextbox();
		addNewAddressPage.clearCityTextbox();
		addNewAddressPage.enterCity(data.get("city"));
		Thread.sleep(1000);
		
		addNewAddressPage.clickOnZipCodeTextbox();
		addNewAddressPage.clearZipCodeTextbox();
		addNewAddressPage.enterZipCode(data.get("zip"));
		Thread.sleep(1000);
		
		addNewAddressPage.selectCountry(data.get("country"));
		if(data.get("primaryBilling").equals("Yes"))
		addNewAddressPage.selectPrimaryBilling();
		Thread.sleep(1000);
		if(data.get("primaryShipping").equals("Yes"))
		addNewAddressPage.selectPrimaryShiping();
		Thread.sleep(1000);
		}
		
	}

	@When("^user click save adress button$")
	public void user_click_save_adress_button() throws Throwable {
	    
	    addNewAddressPage.clickSaveButon();
	}

	@Then("^adress is visible as primary for billing and shipping$")
	public void adress_is_visible_as_primary_for_billing_and_shipping() throws Throwable {
	    
		assertEquals("PODSTAWOWY ADRES ROZLICZENIOWY\nLeszek Otkała\nUl. Testowa 1/1\nSzczecinek, 78-400\nPolska\nT: 604264357\nZmień adres rozliczeniowy", addressBookPage.getTextFromPrimaryAdresField());
	    
	}
	@Then("^adress edit page is opened$")
	public void adress_edit_page_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    editAddressPage= new AddNewAddressPage();
	}

	@When("^user edit personal data$")
	public void user_edit_personal_data(DataTable addressData) throws Throwable {
		for(Map<String, String> data : addressData.asMaps(String.class, String.class)) {
			
			//System.out.println("Nazwisko to: "+data.get("surname"));	
				
			editAddressPage.clickOnFirstNameTextbox();
			editAddressPage.clearFirstNameTextbox();
			editAddressPage.enterFirstName(data.get("name")); 
			
			editAddressPage.clickOnSurNameTextbox();
			editAddressPage.clearSurNameTextbox();
			editAddressPage.enterSurName(data.get("surname"));
			
			editAddressPage.clickOnCompanyTextbox();
			editAddressPage.clearCompanyTextbox();
			editAddressPage.enterCompany(data.get("company"));
			
			editAddressPage.clickOnTelephoneTextbox();
			editAddressPage.clearTelephoneTextbox();
			editAddressPage.enterTelephone(data.get("tel"));
			
			editAddressPage.clickOnFaxTextbox();
			editAddressPage.clearFaxTextbox();
			editAddressPage.enterFax(data.get("fax"));
			
			editAddressPage.clickOnStreetTextbox();
			editAddressPage.clearStreetTextbox();
			editAddressPage.enterStreet(data.get("street"));
			
			editAddressPage.clickOnCityTextbox();
			editAddressPage.clearCityTextbox();
			editAddressPage.enterCity(data.get("city"));
			Thread.sleep(1000);
			
			editAddressPage.clickOnZipCodeTextbox();
			editAddressPage.clearZipCodeTextbox();
			editAddressPage.enterZipCode(data.get("zip"));
			Thread.sleep(1000);
			
			editAddressPage.selectCountry(data.get("country"));
			if(data.get("primaryBilling").equals("Yes"))
			editAddressPage.selectPrimaryBilling();
			Thread.sleep(1000);
			if(data.get("primaryShipping").equals("Yes"))
			editAddressPage.selectPrimaryShiping();
			Thread.sleep(1000);
			}
	}

	@When("^user click save adress button on edit address page$")
	public void user_click_save_adress_button_on_edit_address_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		editAddressPage.clickSaveButon();
	    //throw new PendingException();
	}
	@Then("^address has saved and is visible in address book$")
	public void address_has_saved_and_is_visible_in_address_book() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		assertTrue(addressBookPage.msgSaveConfirmationisVisible());
		assertEquals("PODSTAWOWY ADRES ROZLICZENIOWY\nLeszek Otkała\nUl. Testowa 1/1\nSzczecinek, 78-400\nPolska\nT: 604264357\nZmień adres rozliczeniowy", addressBookPage.getTextFromPrimaryAdresField());
	    //throw new PendingException();
	}

}

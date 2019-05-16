package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage extends MyPanelPage {
	//add new address elements
		@FindBy (css="#firstname")
		WebElement firstNameTB;
		
		@FindBy (css="#lastname")
		WebElement lastNameTB;
		
		@FindBy (css="#company")
		WebElement companyTB;
		
		@FindBy (css="#telephone")
		WebElement telephoneTB;
		
		@FindBy (css="#fax")
		WebElement faxTB;
			
		@FindBy (css="#street_1")
		WebElement streetTB;
		
		@FindBy (css="#city")
		WebElement cityTB;
		
		@FindBy (css="#zip")
		WebElement zipCodeTB;
		
		@FindBy (xpath="//*[@id=\"country\"]")
		Select countryDDL;
		
		@FindBy (css="#primary_billing")
		WebElement primaryBillingCB;
		
		@FindBy (css="#primary_shipping")
		WebElement primaryShippingCB;
		
		@FindBy (css="button.button > span:nth-child(1) > span:nth-child(1)")
		WebElement saveButton;
		
		public AddNewAddressPage() {
			PageFactory.initElements(driver, this);
			
		}	
		
		public void clickOnFirstNameTextbox() {
			firstNameTB.click();
		}
		public void clearFirstNameTextbox() {
			
			firstNameTB.clear();
		}
		public void enterFirstName(String name) {
			firstNameTB.sendKeys(name);
			//firstNameTB.sendKeys(Keys.ENTER);
		}
		
		public void clickOnSurNameTextbox() {
			lastNameTB.click();
		}
		public void clearSurNameTextbox() {
			
			lastNameTB.clear();
		}
		public void enterSurName(String surName) {
			lastNameTB.sendKeys(surName);
			//lastNameTB.sendKeys(Keys.ENTER);
		}
		public void clickOnCompanyTextbox() {
			companyTB.click();
		}
		public void clearCompanyTextbox() {
			
			companyTB.clear();
		}
		public void enterCompany(String surName) {
			companyTB.sendKeys(surName);
			//companyTB.sendKeys(Keys.ENTER);
		}
		
		public void clickOnTelephoneTextbox() {
			telephoneTB.click();
		}
		public void clearTelephoneTextbox() {
			
			telephoneTB.clear();
		}
		public void enterTelephone(String tel) {
			telephoneTB.sendKeys(tel);
			//telephoneTB.sendKeys(Keys.ENTER);
		}
		
		public void clickOnFaxTextbox() {
			faxTB.click();
		}
		public void clearFaxTextbox() {
			
			faxTB.clear();
		}
		public void enterFax(String fax) {
			faxTB.sendKeys(fax);
			//faxTB.sendKeys(Keys.ENTER);
		}
		
		public void clickOnStreetTextbox() {
			streetTB.click();
		}
		public void clearStreetTextbox() {
			
			streetTB.clear();
		}
		public void enterStreet(String city) {
			streetTB.sendKeys(city);
			//streetTB.sendKeys(Keys.ENTER);
		}
		
		public void clickOnCityTextbox() {
			cityTB.click();
		}
		public void clearCityTextbox() {
			
			cityTB.clear();
		}
		public void enterCity(String city) {
			cityTB.sendKeys(city);
			//cityTB.sendKeys(Keys.ENTER);
		}
		
		public void clickOnZipCodeTextbox() {
			zipCodeTB.click();
		}
		public void clearZipCodeTextbox() {
			
			zipCodeTB.clear();
		}
		public void enterZipCode(String zip) {
			zipCodeTB.sendKeys(zip);
			//zipCodeTB.sendKeys(Keys.ENTER);
		}
		
		public void selectPrimaryBilling(){
			if(!primaryBillingCB.isSelected())
				primaryBillingCB.click();
		}
		public void selectCountry(String country) {
			System.out.println(country);
			//podziałać z tym
			//countryDDL.selectByValue("PL");
		}
		public void selectPrimaryShiping(){
			if(!primaryShippingCB.isSelected())
				primaryShippingCB.click();
		}
		
		public void clickSaveButon() {
			saveButton.click();
		}
}

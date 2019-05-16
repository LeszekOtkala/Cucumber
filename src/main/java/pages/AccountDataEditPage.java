package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class AccountDataEditPage extends MyPanelPage {
	
	@FindBy (css="#firstname")
	WebElement firstNameTB;
	
	@FindBy (css="#lastname")
	WebElement lastNameTB;
	
	@FindBy (css="#email")
	WebElement eMailTB;
	
	@FindBy (css="#dummy")
	WebElement currentPasswordTB;
	
	@FindBy (css="#current_password")
	WebElement confirmCurrentPasswordTB;
	
	@FindBy (css="button.button > span:nth-child(1) > span:nth-child(1)")
	WebElement saveButton;
	
	public AccountDataEditPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Dane konta - Bikestar.pl", driver.getTitle());
	}
	
	public void clickOnFirstNameTextbox() {
		firstNameTB.click();
	}
	public void clearFirstNameTextbox() {
		
		firstNameTB.clear();
	}
	public void enterFirstName(String name) {
		firstNameTB.sendKeys(name);
		firstNameTB.sendKeys(Keys.ENTER);
	}
	public void clickOnSurNameTextbox() {
		lastNameTB.click();
	}
	public void clearSurNameTextbox() {
		
		lastNameTB.clear();
	}
	public void enterSurName(String surName) {
		lastNameTB.sendKeys(surName);
		lastNameTB.sendKeys(Keys.ENTER);
	}

	public void clickOnEmailTextbox() {
		eMailTB.click();
	}
	public void clearEmailTextbox() {
		
		eMailTB.clear();
	}
	public void enterEmail(String email) {
		eMailTB.sendKeys(email);
		eMailTB.sendKeys(Keys.ENTER);
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public void clickOnCurrentPasswordTextBox() {
		currentPasswordTB.click();
	}
	public void enterCurrentPasswordTextBox(String pass) {
		currentPasswordTB.sendKeys(pass);
	}
	public void clickOnConfirmCurrentPasswordTextBox() {
		confirmCurrentPasswordTB.click();
	}
	public void enterConfirmCurrentPasswordTextBox(String pass) {
		confirmCurrentPasswordTB.sendKeys(pass);
	}
	public void checkName(String name) {
		
		//System.out.println(firstName.getAttribute("Value"));
		Assert.assertEquals(name, firstNameTB.getAttribute("Value"));
		
	}
}
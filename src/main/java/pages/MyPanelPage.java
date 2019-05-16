package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import util.BasePage;


public class MyPanelPage extends MainPage {
	
	@FindBy(css=".hello > strong:nth-child(1)")	
		WebElement welcomeMessage;
	
	@FindBy(css="div.block:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")
		WebElement accountEditLink;
	
	@FindBy(css="div.block:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")
		WebElement adressBookLink;
	
	
	@FindBy(css="div.col2-set:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > p:nth-child(1)")
		WebElement userData;
	
	public MyPanelPage() {
		PageFactory.initElements(driver, this);
		//Assert.assertEquals("Moje konto - Bikestar.pl", driver.getTitle());
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void checkAdress(String adress) {
		Assert.assertEquals(adress, driver.getCurrentUrl());
	}
	
	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}
	
	public void goToAccountEdit() {
		accountEditLink.click();
	}
	
	public void goToAdressBook() {
		adressBookLink.click();
	}
	
	public String getUserData() {
		System.out.println(userData.getText());
		return userData.getText();
	}
}

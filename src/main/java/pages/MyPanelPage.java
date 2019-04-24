package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import util.BasePage;


public class MyPanelPage extends BasePage {
	
	@FindBy(css=".hello > strong:nth-child(1)")	
		WebElement welcomeMessage;
	
	public MyPanelPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Moje konto - Bikestar.pl", driver.getTitle());
	}
	
	public void checkAdress(String adress) {
		Assert.assertEquals(adress, driver.getCurrentUrl());
	}
	
	public String getWelcomeMessage() {
		return welcomeMessage.getText();
	}
}

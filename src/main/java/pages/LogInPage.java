package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import util.BasePage;

public class LogInPage extends BasePage {
	
	@FindBy(css="#email")
	WebElement emailTextBox;

	@FindBy(css="#pass")
	WebElement passwordTextBox;

	@FindBy(css="#send2")
	WebElement loginButton;
	
	@FindBy(css=".error-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")	
	WebElement warningMessage;

	public LogInPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Login klienta - Bikestar.pl", driver.getTitle());
	}
	
	public void typeEmail(String email) {
			emailTextBox.sendKeys(email);
	}
	
	public void typePassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	public String getWarningMessage() {
		return warningMessage.getText();
	}
}
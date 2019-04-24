package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import util.BasePage;

public class MainPage extends BasePage {
	
	@FindBy(css=".nav-10 > a:nth-child(1) > span:nth-child(1)")
	WebElement kaski;
	
	@FindBy(css="#topline > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)")
	WebElement loginLink;
/*	
	@FindBy(id="pt-logout")
	WebElement logout;
	
	@FindBy(id="firstHeading")
	WebElement titleHeader;
*/	
/*	@FindBy(xpath="//div[@id='p-personal']")
	WebElement personalHeader;*/
	
	public MainPage() {
		PageFactory.initElements(driver, this);
		Assert.assertEquals("Sklep Motocyklowy - Akcesoria i Części Motocyklowe - Bikestar.pl", driver.getTitle());
	}
	
public void mouseOverKaski() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverKaski=builder.moveToElement(kaski);
		actionMouseOverKaski.perform();
	}	

public void goToLoginPage() {		
	loginLink.click();
}


/*	
	public boolean wikipediaLogoIsVisible() {
		return wikipediaLogo.isDisplayed();
	}
	
	public void goToHomePage() {
		wikipediaLogo.click();
	}
	
	public void logOut() {
		logout.click();
	}
*/
}
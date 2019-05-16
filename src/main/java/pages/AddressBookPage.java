package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage extends MyPanelPage{

	@FindBy(css="button.button > span:nth-child(1) > span:nth-child(1)")
	WebElement addNewAddressLink;
	
	@FindBy(css=".col-1 > ol:nth-child(2) > li:nth-child(1) > p:nth-child(3) > a:nth-child(1)")
	WebElement editPrimaryBillingAddress;
	
	
	public AddressBookPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnAddNewAdressLink() {
		addNewAddressLink.click();
	}
	
	public void clickOnEditPrimaryBillingAddress() {
		addNewAddressLink.click();
	}
}


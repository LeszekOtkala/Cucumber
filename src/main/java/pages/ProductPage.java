package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class ProductPage extends MainPage {
	//cechy wspolne dla produktów
	@FindBy(xpath="//div[@class='breadcrumbs']")
	WebElement breadcrumbsTrail;
	
	public boolean breadcrumbsTrailIsDisplayed() {
		return breadcrumbsTrail.isDisplayed();
	}
}

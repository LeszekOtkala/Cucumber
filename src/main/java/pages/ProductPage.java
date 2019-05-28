package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class ProductPage extends MainPage {
	//cechy wspolne dla produktów
	@FindBy(xpath="//div[@class='breadcrumbs']")
	WebElement breadcrumbsTrail;
	
	@FindBy(xpath="//button[@class='button btn-cart']")
	WebElement addToCartButton;
	
		
	public boolean breadcrumbsTrailIsDisplayed() {
		return breadcrumbsTrail.isDisplayed();
	}
	
	public boolean addToCartButtonIsVisible(){
		return addToCartButton.isDisplayed();
	}
}

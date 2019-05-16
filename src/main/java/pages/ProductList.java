package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public abstract class ProductList extends MainPage {

	//cechy wspólna dla list produktów
	
	@FindBy(xpath="//div[@class='breadcrumbs']")
	WebElement breadcrumbsTrail;
	
	@FindBy(xpath="//div[@id='column_right']//div[1]//div[1]//div[1]//div[1]//select[1]")
	WebElement sortBySelect;
		
	
	public boolean breadcrumbsTrailIsDisplayed() {
		return breadcrumbsTrail.isDisplayed();
	}
	
	public void selectSortBy(String sortBy) {
		Select sort=new Select(sortBySelect);
		sort.selectByVisibleText(sortBy);;
		
	}	
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntegralHelmetsProductList extends ProductList {
	
	
	@FindBy (xpath="//body[contains(@class,'catalog-category-view categorypath-kaski-motocyklowe-kaski-integralne-1-html category-kaski-integralne')]/div[@id='wrap']/section[@id='content']/div[contains(@class,'container top')]/div[contains(@class,'row')]/div[@id='column_right']/div[contains(@class,'category-products')]/div[contains(@class,'row big_with_description')]/div[1]")
	WebElement firstIntegralHelmetLink;
	
	public IntegralHelmetsProductList() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnFirstIntegralHelmetLink() {
		firstIntegralHelmetLink.click();
	}
	
}

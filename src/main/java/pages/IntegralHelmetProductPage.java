package pages;

import org.openqa.selenium.support.PageFactory;

public class IntegralHelmetProductPage extends ProductPage{
	public IntegralHelmetProductPage() {
		PageFactory.initElements(driver, this);
		
	}
}

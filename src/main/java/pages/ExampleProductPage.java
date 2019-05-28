package pages;

import org.openqa.selenium.support.PageFactory;

public class ExampleProductPage extends ProductPage{

	public ExampleProductPage() {
		PageFactory.initElements(driver, this);
	}
}

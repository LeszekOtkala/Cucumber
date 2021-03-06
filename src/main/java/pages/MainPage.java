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
	

	
/*	@FindBy(xpath="//div[@id='p-personal']")
	WebElement personalHeader;*/
	@FindBy(css="div.fadelink:nth-child(2)")
	WebElement accountDDL;
		
	@FindBy(css="div.fadelink:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
	WebElement myAccountLink;

	@FindBy (xpath="//li[@class='level0 nav-10 first parent']//span[contains(text(),'Kaski')]")
	WebElement mainMenuHelmets;
	
	@FindBy (xpath="//li[@class='level0 nav-11 parent']//span[contains(text(),'Odzież')]")
	WebElement mainMenuClothes;
	
	@FindBy (xpath="//li[@class='level0 nav-12 parent']//span[contains(text(),'Rękawice')]")
	WebElement mainMenuGloves;
	//jeszcze trochę tych elementów menu można wypisać
	@FindBy (xpath="//ul[@id='nav']//a[contains(text(),'Blog')]")
	WebElement mainMenuBlog;
		
	@FindBy (xpath="//ul[contains(@class,'easycatalog-grid easycatalogimg-cols-10 listastrglowna')]")
	WebElement tableMenu;
	
	@FindBy (xpath="//h2[contains(@class,'glownatytul')][contains(text(),'Wyróżnione produkty!')]")
	WebElement highlightedProducts;
	
	@FindBy (xpath="//li[@class='level1 nav-10-1 first title']//a[contains(text(),'Kaski Integralne')]")
	WebElement integralHelmetsMenuItem;
	
	@FindBy (xpath="//body[contains(@class,'cms-index-index cms-buyshop-home-advanced')]/div[@id='wrap']/section[@id='content']/div[contains(@class,'std')]/div[contains(@class,'container')]/div[contains(@class,'row isotope-outer isotope')]/div[1]/div[1]")
	//@FindBy (xpath="//body[contains(@class,'cms-index-index cms-buyshop-home-advanced')]/div[@id='wrap']/section[@id='content']/div[contains(@class,'std')]/div[contains(@class,'container')]/div[contains(@class,'row isotope-outer isotope')]/div[1]")
	WebElement firstHighlightedProduct;
	
	
	
	public MainPage() {
		PageFactory.initElements(driver, this);
		//Assert.assertEquals("Sklep Motocyklowy - Akcesoria i Części Motocyklowe - Bikestar.pl", driver.getTitle());
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean mainMenuHelmetsIsDisplayed() {
		return mainMenuHelmets.isDisplayed();
	}
	public void mouseOverMainMenuHelmets() {
			Actions builder=new Actions(driver);
			Actions actionMouseOverMainMenuHelmets=builder.moveToElement(mainMenuHelmets);
			actionMouseOverMainMenuHelmets.perform();
		}	
	public boolean IntegralHelmetMenuItemIsDisplayed() {
		return integralHelmetsMenuItem.isDisplayed();
	}
	
	public void clickIntegralHelmetsMenuItem() {
		integralHelmetsMenuItem.click();
	}
	
	
	public boolean mainMenuClothesIsDisplayed() {
		return mainMenuClothes.isDisplayed();
	}
	
	
	public void mouseOverMainMenuClothes() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverMainMenuClothes=builder.moveToElement(mainMenuClothes);
		actionMouseOverMainMenuClothes.perform();
	}
	
	
	public boolean mainMenuGlovesIsDisplayed() {
		return mainMenuGloves.isDisplayed();
	}
	
	
	public void mouseOverMainMenuGloves() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverMainMenuGloves=builder.moveToElement(mainMenuGloves);
		actionMouseOverMainMenuGloves.perform();
	}
	//tu kolejne metody dla głównego menu
	
	public void mouseOverMainMenuBlog() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverMainMenuBlog=builder.moveToElement(mainMenuBlog);
		actionMouseOverMainMenuBlog.perform();
	}
	
	public boolean mainMenuBlogIsDisplayed() {
		return mainMenuBlog.isDisplayed();
	}
	
	public void mouseOverTableMenu() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverTableMenu=builder.moveToElement(tableMenu);
		actionMouseOverTableMenu.perform();
	}
	public boolean tableMenuIsDisplayed() {
		return tableMenu.isDisplayed();
	}
	public void mouseOverHighlightedProducts() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverHighlightedProducts=builder.moveToElement(highlightedProducts);
		actionMouseOverHighlightedProducts.perform();
	}
	public boolean highlightedProductsIsDisplayed() {
		return highlightedProducts.isDisplayed();
	}
	public void clickOnFirstHighlightedProduct() {
		
		firstHighlightedProduct.click();
	}
	
	
	
	public void goToLoginPage() {		
		loginLink.click();
	}
	public void mouseOverAccountDDL() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverAccountDDL=builder.moveToElement(accountDDL);
		actionMouseOverAccountDDL.perform();
	}	
	
	public void goToMyAccount() {
		myAccountLink.click();
	}
	
	
}
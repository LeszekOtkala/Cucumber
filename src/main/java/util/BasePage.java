package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	public static WebDriver driver = null;
	
	public static void initialize() {
		if (driver == null) {
			if (Utils.browser.contentEquals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (Utils.browser.contentEquals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(Utils.url);
		}
	}
	@FindBy(css="div.fadelink:nth-child(2)")
	WebElement accountDDL;
		
	@FindBy(css="div.fadelink:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
	WebElement myAccountLink;

	
	public void mouseOverAccountDDL() {
		Actions builder=new Actions(driver);
		Actions actionMouseOverAccountDDL=builder.moveToElement(accountDDL);
		actionMouseOverAccountDDL.perform();
	}	
	
	public void goToMyAccount() {
		myAccountLink.click();
	}
	public static void closeWindow(){
		driver.close();
		driver = null;
	}
	
	public static void quitBrowser() {
		driver.quit();
		driver = null;
	}
}
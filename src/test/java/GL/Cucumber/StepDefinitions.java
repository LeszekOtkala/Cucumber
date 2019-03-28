package GL.Cucumber;

import static org.junit.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	private WebDriver driver;

	
	
//  ------ Given ------
	
@Given("^User opens Bikestar page$")
public void user_opens_Bikestar_page() throws Throwable {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.bikestar.pl");
}



// ------- When -------

@When("^User click login link$")
public void user_click_login_link() {
	driver.findElement(By.cssSelector("#topline > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(1)")).click();
}

@When("^User enter valid email$")
public void user_enter_valid_email() {
	driver.findElement(By.cssSelector("#email")).sendKeys("leszek1502@gmail.com");
}
@When("^User enter invalid email$")
public void user_enter_invalid_email() {
	driver.findElement(By.cssSelector("#email")).sendKeys("leszek0215@gmail.com");
}
@When("^User enter valid password$")
public void user_enter_valid_password() {
	driver.findElement(By.cssSelector("#pass")).sendKeys("alskdjfh");
}
@When("^User enter invalid password$")
public void user_enter_invalid_password() {
	driver.findElement(By.cssSelector("#pass")).sendKeys("alamakota");
}

@When("^User clicks on search textbox$")
public void user_clicks_on_search_textbox() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@When("^User provides a text$")
public void user_provides_a_text() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User clicks on search button$")
public void user_clicks_on_search_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User click login button$")
public void User_click_login_button() throws Throwable {
	driver.findElement(By.cssSelector("#send2")).click();  
}

// --------- Then ----------



@Then("^product is added to cart$")
public void product_is_added_to_cart() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}



@Then("^Article is displayed$")
public void article_is_displayed() throws Throwable {
   
}
@Then("^my panel page is opened at adress (.*)$")
public void my_panel_page_is_opened_at_adress(String adress) throws Throwable {
	
		System.out.println(adress);
		assertEquals((String)driver.getCurrentUrl(),adress);
	//"https://www.bikestar.pl/customer/account/"
}
//Welcome user_name user_surname is displayed
@Then("^Welcome message (.*) is displayed$")
public void Welcome_message_is_displayed(String message) throws Throwable {
	System.out.println((driver.findElement(By.cssSelector(".hello > strong:nth-child(1)")).getText()));
   assertEquals((driver.findElement(By.cssSelector(".hello > strong:nth-child(1)")).getText()),message);
}

@Then("^Warning message =(.*) is displayed$")
public void Warning_message_is_displayed(String warning) throws Throwable {
	System.out.println(driver.findElement(By.cssSelector(".error-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")).getText());
    System.out.println(warning);
    assertEquals(driver.findElement(By.cssSelector(".error-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)")).getText(),warning);
}

@After
public void closeDriver() {
	driver.close();
}



}
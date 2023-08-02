package steps;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HotSaleDefinitionPage;

public class HotSalesStepDefinition 
{

	WebDriver driver;
	ResourceBundle rb;

	/*
	 @Given("I Launch the browser")
	 public void launchbrowser() 
	 {
	 	WebDriverManager.chromedriver().setup();
	 	 driver = new ChromeDriver();
	 }

	 @Given("Open Canadian Tire Website")
	 public void open_CTwebsite() 
	 {
	 	rb= ResourceBundle.getBundle("config");
	     driver.get(rb.getString("appURL"));
	 }
	 
	@When("I click on Hot Sale option")
	public void i_click_on_hot_sale_option() 
	{

		HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
		hsp.clickHotSale();
	}

	@When("I click on Everyday Essentials")
	public void i_click_on_everyday_essentials() 
	{
		HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
		hsp.evrydyEssntls.click();

	}

	@When("I click Laundry & Dish soap")
	public void i_click_laundry_dish_soap() 
	{

		HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
		hsp.landryNdishsp.click();

	}

	@Then("I validate the title of the page")
	public void i_validate_the_title_of_the_page() 
	{
		HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
		hsp.validateTitle();
	}

	@Then("I close the browser")
	public void i_close_the_browser() 
	{
		driver.quit();

	}


*/



}

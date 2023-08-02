package steps;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HotSaleDefinitionPage;
import pageObject.OutdoorLiving;




public class StepDefinition 
{
	WebDriver driver;
	
	ResourceBundle rb;

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


@When("I click outdoor living tab")
public void clickoutdoor_living_tab() 
{
	OutdoorLiving ol = new OutdoorLiving(driver);
	ol.click_outDrLvngtab();
	
}

@When("I click on all outdoor living option")
public void clickOutdoorLivin()
{
	OutdoorLiving ol = new OutdoorLiving(driver);
	ol.all_outDrLivng.click();
}

@Then("User must be able to go view all OutdoorLiving products")
public void validate_outdoorLiving_pgeTitle() 
{
	OutdoorLiving ol = new OutdoorLiving(driver);
	ol.pageTitle();
	System.out.println(driver.getTitle());

}






//**********


@When("I click on Hot Sale option")
public void i_click_on_hot_sale_option() 
{

	HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
	hsp.clickHotSale();
}

@And("I click on Everyday Essentials")
public void i_click_on_everyday_essentials() 
{
	HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
	hsp.evrydyEssntls.click();

}

@And("I click Laundry & Dish soap")
public void i_click_laundry_dish_soap() 
{

	HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
	hsp.landryNdishsp.click();

}

@When("I validate the title of the page")
public void i_validate_the_title_of_the_page() 
{
	HotSaleDefinitionPage hsp= new HotSaleDefinitionPage(driver);
	hsp.validateTitle();
}


@And("Close the browser")
public void close_the_browser() throws Exception 
{
	Thread.sleep(Duration.ofSeconds(3));
	driver.close();
	driver.quit();
}
 
 

	
}

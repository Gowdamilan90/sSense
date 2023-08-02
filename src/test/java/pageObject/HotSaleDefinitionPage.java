package pageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotSaleDefinitionPage 
{
	WebDriver driver;
	

	public HotSaleDefinitionPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//ul[@id='secondaryMenuBar']/li[7]")
	public WebElement hotSale;
	
	@FindBy(linkText="Everyday Essentials")
	public WebElement evrydyEssntls;
	
	@FindBy(xpath="//span[text()='Laundry & Dish Soap ']")
	public WebElement landryNdishsp;
	
	// "Soap | Canadian Tire"
	

	
	
	
	public void clickHotSale()
	{
		hotSale.click();
	}
	
	
	
	
	
	public void validateTitle()
	
	{
		String title= driver.getTitle();
		System.out.println(title);
		if (title.equals("Soap | Canadian Tire"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Test Failed");
			Assert.assertTrue(false);
		}
		
	}
	
}

package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomeN_PetsPage 
{
	WebDriver milan;

	public HomeN_PetsPage(WebDriver milan)
	{
		this.milan=milan;
		PageFactory.initElements(milan, this);
	
	}
	
	@FindBy(xpath="//div[@class='nl-col-md-12 nl-col-sm-12 nl-col-xs-6']/nav/ul/li[3]/button[text()='Home & Pets']")
	WebElement homenPets;
	
	@FindBy(xpath="//div[@class='nl-row nl-sub-categories']/div[5]/ul/li[5]/div/a[text()='Bedroom Furniture']")
	WebElement bedrm_furn;
	
	@FindBy(xpath="//div[@class='nl-facet-bar--desktop']/div[6]/button")
	public WebElement materials_checkbox;
	@FindBy(xpath="//div/div/div[6]/div/div/ul/li[4]/div/label")
	WebElement metal;
	
	@FindBy(xpath="//div[@id='title__categorylevelN-168-0059-4']") 
	WebElement prdct;
	
	@FindBy(xpath="//div[@class='nl-authored-text-block--second-row--seo-title']/h2[text()='Bedroom Furniture Ideas']")
	public WebElement textElement;
	
//	@FindBy()
//	WebElement xxx;
	
	
	//Bedroom Furniture | Canadian Tire
	
	
	
	
	
	//Action class
	
	public void click_HomenPet_Tab ()
	{
		homenPets.click();
	}
	
	
	public void click_BednFurn_Tab()
	{
		bedrm_furn.click();
		
		String title= milan.getTitle();
		
		
		
		
		if (title.equalsIgnoreCase("Bedroom Furniture | Canadian Tire"))
		{
			System.out.println("TestPassed");
			Assert.assertTrue(true);
			System.out.println("Tile of the page is :"+title);
		}
		
		else
		{
			System.out.println("TestFailed");
			Assert.assertTrue(false);
			System.out.println("Tile of the pageshould be :"+title);
			
		}
	}
	
	
	public void click_matrl_ChekBox ()
	{
		materials_checkbox.click();
		
		metal.click();
		
	}
	
	public void click_product()
	{
		prdct.click();
	}
	
	
	
}

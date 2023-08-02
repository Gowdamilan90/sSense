package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
//	@FindBy()
//	WebElement xxx;
//	@FindBy()
//	WebElement xxx;
//	@FindBy()
//	WebElement xxx;
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
			Assert.assertEquals(true, true);
			System.out.println("Tile of the page is :"+title);
		}
		
		else
		{
			System.out.println("TestFailed");
			Assert.assertEquals(true, false);
			System.out.println("Tile of the pageshould be :"+title);
			
		}
	}
	
	
	
	
}

package pageObject;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutdoorLiving 
{

	WebDriver milan;
	
	public OutdoorLiving(WebDriver milan)
	{
		this.milan=milan;
		
		PageFactory.initElements(milan, this);
	}
	
	
	
	


	@FindBy(id="4-Outdoor Living")
	 WebElement outDrLivng; 
	
	
	@FindBy(linkText="Shop All Outdoor Living")
	public WebElement all_outDrLivng; 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(linkText="Men's")
	public WebElement Mens_beauty; 
	
	
	@FindBy(linkText="men's gifts & sets")
	WebElement mens_gift; 
	
	@FindBy(xpath="//span[text()='Patio Furniture & Décor']")
	WebElement furn_decor; 
	

	@FindBy(linkText="Patio Tables")
	WebElement patio_Table;
	
	
	@FindBy(id="title__categorylevelN-088-2298-2")
	WebElement list_view;
	
	@FindBy(xpath="//span[text()='Product Availability']")
	WebElement prdct_avail;
	
	@FindBy(xpath="//div[@class='custom-dropdown-panel--open']/div/ul/li/div/label[@for='nl-checkbox__In Stock At My Store custom-availability']/span[1]")
	WebElement InStock_AtStore;
	
	@FindBy(xpath="//button[@id='SortByFilter']")
	WebElement relevance;
	
	@FindBy(xpath="//div[@class='custom-dropdown-panel--open']/ul/li[3]/div/label/span[1]")
	WebElement low_high;
	
	
	
	
	
	
	public void click_outDrLvngtab()
	{
	
		outDrLivng.click();
	}
	
	public void click_All_outDrLivng()
	{
	
		all_outDrLivng.click();
	}
	
	public void pageTitle()
	{
		
		String title=milan.getTitle();
		if (title.equalsIgnoreCase("Outdoor Living | Canadian Tire"))
		{
			Assert.assertTrue(true);
			//  System.out.println("Test Passed ");
		}
		else
		{
			Assert.assertTrue(false);
			//System.out.println("Test Failed ");
			
		}
	}
	
	public void click_furn_decor()
	{
		furn_decor.click();
	}
	
	public void select_patioTable()
	{
		patio_Table.click();
	}
	
	public void scroll_tillListView()
	{
		JavascriptExecutor js = (JavascriptExecutor) milan;
		
		//js.executeScript("window.scrollBy(0,3000)", "");                    // Scroll by Unit
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  // Scroll till end
		
		
		
		
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)", "");//Scroll till initial location(top of the page)
		
		
		js.executeScript("arguments[0].scrollIntoView();", list_view);    //Scroll till an element located

	}
	
	public void click_prdct_avail()
	{
		Actions act = new Actions(milan);
		act.moveToElement(prdct_avail).click().perform();
		
		InStock_AtStore.click();
		
	}
	
	public void click_L2Highrelevance()
	{
		
		relevance.click();
		low_high.click();
		
	}
	
	
	
}

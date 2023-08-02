package pageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartyPage 
{

	
	public WebDriver milan;
	
	public PartyPage (WebDriver milan)
	{
		this.milan=milan;
		
		PageFactory.initElements(milan, this);
	}
	
	
	@FindBy(xpath="//button[@id='5-Party City']")
	 WebElement party_city;
	
	@FindBy(linkText="Graduation")
	 WebElement Gradtn;
	
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement home;
	
	@FindBy(linkText="Auto Service")
	WebElement autoService;
	
	@FindBy(linkText="Michelin")            
	WebElement Michelin;
	
	
	@FindBy(linkText="Support")
	WebElement support;
	
	
	
	
	
	
	
	
	
	
	public void click_party_city() throws Exception 
	{
		party_city.click();
	Thread.sleep(Duration.ofSeconds(5));
	}
	
	/*
	public void open_Gradtn_new_win()
	{
		
		try {
		Actions act= new Actions(milan);
		

	act.contextClick(Gradtn).build().perform();
			Thread.sleep(Duration.ofSeconds(3));
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);

			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	*/
	
	
	
	public void open_Gradtn_new_win()	
	{
		Actions act= new Actions(milan);
		
		act.keyDown(Keys.COMMAND).moveToElement(Gradtn).click().perform();
		//Gradtn.click();
	}
	
	
	public void selectSupport()
	{
		
	
		support.click();
		
//		autoService.click();	
//		Michelin.click();
		
	}
	
}

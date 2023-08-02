package pageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RightClickPage
{
	public WebDriver milan;

	public RightClickPage (WebDriver milan)
	{
		this.milan=milan;

		PageFactory.initElements(milan, this);
	}



	@FindBy(xpath="//button[@id='4-Outdoor Living']")
	WebElement outdr_livin;
	
	

	@FindBy(linkText="Chainsaws")
	WebElement Chainsaws;






	public void click_outdrLivin()

	{
		outdr_livin.click();

	}


	public void open_chainsaw() throws AWTException	
	{
		
		//Chainsaws.click();
		Actions act= new Actions(milan);

		act.contextClick(Chainsaws).build().perform();
//		act.contextClick(Chainsaws).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_RIGHT);
		//robot.keyRelease(KeyEvent.VK_RIGHT);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		

//		act.keyDown(Keys.COMMAND).moveToElement(Chainsaws).click().perform();
//		Chainsaws.click();
	}


}

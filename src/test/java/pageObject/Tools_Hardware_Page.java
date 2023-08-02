package pageObject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tools_Hardware_Page 
{
	//                         ******************************************  END to END TEST **********************************
	WebDriver milan;
	
	public Tools_Hardware_Page (WebDriver milan)
	
	{
		this.milan=milan;
		
		PageFactory.initElements(milan, this);
	
	}

	
	@FindBy(id="1-Tools & Hardware")
			//(//button[@id='1-Tools & Hardware']")
	WebElement TH_tab;
	

	@FindBy(linkText="Hand Tools")
	WebElement hand_tools;
	
	@FindBy(xpath="//span[text()='Sockets & Ratchets']")
	WebElement sock_rackets;
	
	@FindBy(xpath="//div[@id='title__categorylevelN-058-0235-6']")
	WebElement generalToolItem;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	 WebElement add_toCart;
	
	@FindBy(id="footer-btn")
	WebElement continue_cart;
	
	@FindBy(xpath="//span[text()='Remove']")
	WebElement remove;
	
	@FindBy(xpath="//span[text()='Item has been removed from Cart']")
			//div[text()='Looks like your cart is empty']")
	public WebElement cart_TextMessage;
	
	
	//***************************************************************Action Methods Below******************************************************
	
	
	
	public void click_TH_Tab()
	
	{
		TH_tab.click();
	}
	
	
	public void click_all_handTool()
	{
		hand_tools.click();
	}
	
	public void pick_GT_socketandRackets()
	{
		sock_rackets.click();
		generalToolItem.click();
	}
	
	
	public void addTocart()
	{
		add_toCart.click();
		continue_cart.click();
	}
	
	
	public void remove_cartItem() throws Exception 
	{
		remove.click();
		String msg=cart_TextMessage.getText();
		System.out.println(msg);
		
		
		
		
		
		if (msg.equals("Item has been removed from Cart"))
		{
			System.out.println("Test Pass");
			
			TakesScreenshot ts=(TakesScreenshot)milan;  
			File src=ts.getScreenshotAs(OutputType.FILE);         //To take screenshot and save it in a file

			File target= new File("./screenshots/login.png");    //For Macbook User to set a target file in the project
			
			// File target= new File(".\\screenshots\\login.png");    //For Windows User
			
			
			
			
			FileUtils.copyFile(src, target);      						// To copy file to a target folder		
			
		}
		
		else
			{System.out.println("Test Failed");
			
			}
		
		
	}
	
	
}

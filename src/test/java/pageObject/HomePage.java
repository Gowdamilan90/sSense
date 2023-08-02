package pageObject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage 
{

	public WebDriver ldriver;

	public HomePage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		//this.driver= driver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(linkText="Sign in")    //linkText
	WebElement SignInlink;
	
	
	@FindBy(xpath="//div[@class='gigya-composite-control gigya-composite-control-textbox gigya-composite-control-loginID']/input[@data-screenset-roles='instance']")
			//input[@id='gigya-loginID-107508554302582130']
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='gigya-password-110355237210106350']")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Sign In']")
	WebElement LoginBtn;
	
	@FindBy(xpath="//div[@class='CTR_modal-loyalty-offer']/button[@class='CTR_loyalty-offer-close-button']")
	
	WebElement popUp_close;
	
	@FindBy(xpath="//a[@data-link-value='Canadian Tire Home page']") 
	public WebElement home_logo;
	
	
	
	
	
	
	
	@FindBy(xpath="//iframe[@class='box-223304']")
	WebElement iFrame_id;
	
	
	
	
	@FindBy(xpath="//div[@id='button2_wrapper']")
	WebElement noThanks_btn;
	
	
	@FindBy(xpath="//div[@class='content']/div[1]")
	WebElement press_hold; 
	
	
	
	
	
	
	@FindBy(xpath="//span[@class='type-ds-small-text commerce-tile-cta-content__cta'and text()='Shoppers Drug Mart']")
	WebElement Shoppr_drugMart_icon;
	
	@FindBy(xpath="//a[normalize-space()='Sign In']")
	WebElement shprs_loginLink;
	
	
	@FindBy(id="email")
	WebElement login_email;
	
	@FindBy(id="password")
	WebElement login_pswd; 
	

	
	
	
	

	
	public void click_signIn()
	{
		
		SignInlink.click();
		
		
	}
	
	public void setusername(String username)
	{
		UserName.sendKeys(username);
		//continueButton.click();
		
	}
	
	public void setpassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void login() throws InterruptedException 
	{
	
		LoginBtn.click();
		Thread.sleep(Duration.ofSeconds(5));
		
		//close_btn.click();
		
		
	}
	
	
	public void close_popUp()
	{
		popUp_close.click();
	}
	
	public void Click_logo()
	{
		home_logo.click();
	}
	
	
	
	
	
	
	
	
	
	


	

}

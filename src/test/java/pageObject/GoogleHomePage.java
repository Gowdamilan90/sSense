package pageObject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage 
{
	WebDriver milan;
	
 public GoogleHomePage(WebDriver milan)
 {
	  this.milan=milan;
	  PageFactory.initElements(milan, this);
 }
	
	
 
 @FindBy(id="APjFqb")
 WebElement searchBox;
 
 
 @FindBy(xpath="//div[@class='HiHjCd']/a[text()='History']")
 WebElement history;
 
 @FindBy(xpath="//div[text()='Notes']")
 WebElement notes;
 
 
 public void enter_text()
 {
	 searchBox.sendKeys("Italy");
	 searchBox.sendKeys(Keys.ENTER);
	  
 }
 
 public void open_history()
 {
	 history.click();
	  
 }
 
 public void RightClickOn_History() throws InterruptedException
 {
	 
	 Actions  act = new Actions(milan);
	 //act.contextClick(history).build().perform();
	 
	act.keyDown(Keys.COMMAND).moveToElement(history).click().perform();
	 
	 
	 String currentWindowHandle = milan.getWindowHandle();
	 
	// Get all window handles
	 Set<String> windowHandles = milan.getWindowHandles();

	 // Loop through all the handles and switch to the new window
	 for (String windowHandle : windowHandles) {
	     if (!windowHandle.equals(currentWindowHandle)) {
	         milan.switchTo().window(windowHandle);
	         break; // Break the loop once you find the new window
	     }
	 }
	
	 
	 notes.click();
	 
	 Thread.sleep(Duration.ofSeconds(3));
	 milan.switchTo().window(currentWindowHandle);
	 

	  
 }
 
 
 
}

package testCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import pageObject.Tools_Hardware_Page;
import testBase.BaseClass;

public class Test_ToolsandHardware extends BaseClass

//                         ******************************************  END to END TEST **********************************


{
	
	@Test

	public void test001_handTool() throws IOException 
	{
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Tools_Hardware_Page thp=new Tools_Hardware_Page(milan);
		
		thp.click_TH_Tab();;
		
		thp.click_all_handTool();
		
	}
	
	@Test
	public void test002_pickSkRk_GT() 
	{
		
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Tools_Hardware_Page thp=new Tools_Hardware_Page(milan);
		thp.pick_GT_socketandRackets();

	}
	
	
	@Test
	public void test003_addTo_cart()
	{
		Tools_Hardware_Page thp=new Tools_Hardware_Page(milan);
		thp.addTocart();
	}
	
	@Test
	public void test004_removeFrom_cart() throws Exception
	{
		Thread.sleep(Duration.ofSeconds(5));
		Tools_Hardware_Page thp=new Tools_Hardware_Page(milan);
		thp.remove_cartItem();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 System.out.println(milan.getTitle());
		
		if (milan.getTitle().equals("Electronics | Shoppers Drug Mart®"))
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
	 */
	
	//@Test(priority=1)

	public void ScrollWPbyUnit_Test() throws InterruptedException 
	{
		JavascriptExecutor js= (JavascriptExecutor)milan;
		
//		js.executeScript("window.scrollBy(0,3000)", "");                              //Scroll by unit
//		System.out.println(js.executeScript("return window.pageYOffset"));
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  // Scroll till end
		
		Tools_Hardware_Page thp=new Tools_Hardware_Page(milan);
		
		//js.executeScript("arguments[0].scrollIntoView();",);  //Scroll till an element located
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)", "");//Scroll till initial locataion(top of the page)
		
		
	}
	
	
	
	
	
	//@Test(priority=1)
	public void select_apple_airpods() throws InterruptedException
	{
		Tools_Hardware_Page thp=new Tools_Hardware_Page(milan);

//		ep.click_airpodsTab();
//		Thread.sleep(Duration.ofSeconds(3));
//		
//		ep.click_airpods_2ndGen();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

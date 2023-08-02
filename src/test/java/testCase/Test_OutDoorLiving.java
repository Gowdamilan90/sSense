package testCase;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.OutdoorLiving;
import testBase.BaseClass;

public class Test_OutDoorLiving extends BaseClass
{
	
	 //                                ***********************SCROLL to BOTTOM; To Unit ; Back TO TOP *********************************************

	@Test

	public void Test001_Click_AlloutdorLivng_tab() 
	{

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		OutdoorLiving ol=new OutdoorLiving(milan);

		//ol.click_outDrLvngtab();
		ol.click_All_outDrLivng();

		System.out.println("Clicked all outdoor living");
	}



	//@Test
	public void Test002_Click_allFurn_decor() throws InterruptedException 
	{

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		OutdoorLiving ol=new OutdoorLiving(milan);

		ol.click_furn_decor();

		System.out.println("Furniture & Decor Selected");
		Thread.sleep(Duration.ofSeconds(5));
	}

	//@Test
	public void Test003_Click_PatioTable() throws InterruptedException 
	{

		OutdoorLiving ol=new OutdoorLiving(milan);
		ol.select_patioTable();
		
		

		System.out.println("PatioTable Selected");
		Thread.sleep(Duration.ofSeconds(5));
	}


	//@Test
	public void Test004_scrollDown() throws InterruptedException 
	{

		OutdoorLiving ol=new OutdoorLiving(milan);
		ol.scroll_tillListView();


		System.out.println("Scroll Down till List View");
		Thread.sleep(Duration.ofSeconds(5));
	}



	//@Test 
	public void Test005_selectAvail_prdct() throws InterruptedException  

	{

		OutdoorLiving ol=new OutdoorLiving(milan);
		ol.click_prdct_avail();

		

		System.out.println("Select prdct avail");
		Thread.sleep(Duration.ofSeconds(5));

	}

	//@Test 
	public void Test006_selectLow2HighPrice()
	{
		OutdoorLiving ol=new OutdoorLiving(milan);
		ol.click_L2Highrelevance();

	}
	
	@Test 
			public void Test007_validateTitle()
			{
				OutdoorLiving ol=new OutdoorLiving(milan);
			 ol.pageTitle();

			}
}

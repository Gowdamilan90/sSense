package testCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import pageObject.PartyPage;
import testBase.BaseClass;
import testBase.GoogleBaseClass;

public class TestPartyPage extends BaseClass 
{

	//************************************* HANDLE WINDOWS ************************************************


	@Test
	public void Test001_click_prtyCity() throws Exception
	{
		System.out.println("Current URL is:"+ milan.getCurrentUrl());
		System.out.println(" Title of the page is:"+ milan.getTitle());

		System.out.println(" ID of the page is:"+ " "+ milan.getWindowHandle());

		String winID=milan.getWindowHandle();
		System.out.println(winID);


		PartyPage pp= new PartyPage(milan);

		pp.click_party_city();

	}


	@Test
	public void Test002_open_Gradtn_new_win() 
	{
		PartyPage pp= new PartyPage(milan);

		pp.open_Gradtn_new_win();

	}

	@Test
	public void Test003_new_winselectSupport() 
	{

		/*
		Set <String> iDs= milan.getWindowHandles();

		List <String> iDLists = new ArrayList(iDs);                //*********************** CONVERT SET OF STRING TO LIST **************************

		String FrstWindowID =iDLists.get(0);
		String ScndWindowID =iDLists.get(1);

		milan.switchTo().window(ScndWindowID);//manage().window().fullscreen();                        //*********************** SWITCH TO 2ND WINDOW *******************************

	
		System.out.println(" ID of the 2nd page is:"+ " "+ milan.getWindowHandle());
		System.out.println(" Title of the 2nd page is:"+ milan.getTitle());
		
			*/
		PartyPage pp= new PartyPage(milan);
		pp.selectSupport();
		
		

	}
	
	
	
}

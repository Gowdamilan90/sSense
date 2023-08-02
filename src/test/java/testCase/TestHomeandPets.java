package testCase;

import org.testng.annotations.Test;

import pageObject.HomeN_PetsPage;
import testBase.BaseClass;

public class TestHomeandPets extends BaseClass
{
	
	
	@Test
	public void Test001_openBedFurnPage()
	{
		HomeN_PetsPage hp= new HomeN_PetsPage(milan);
		hp.click_HomenPet_Tab();
		hp.click_BednFurn_Tab();
	}
	

}

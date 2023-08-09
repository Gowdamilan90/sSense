package testCase;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
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
		
		hp.click_matrl_ChekBox();
		
	
	}
	
	@Test
	public void Test002_scroll_tillElement() throws InterruptedException
	{
		HomeN_PetsPage hp= new HomeN_PetsPage(milan);
		JavascriptExecutor js = (JavascriptExecutor) milan;
		
		Thread.sleep(Duration.ofSeconds(5));
		js.executeScript("arguments[0].scrollIntoView(true);", hp.textElement);
		
		
		hp.textElement.click();
		
		System.out.println(hp.textElement.getText());
		
		
	}
	
	
	
	//@Test
	public void Test002_selectProduct()
	{
		HomeN_PetsPage hp= new HomeN_PetsPage(milan);
		hp.click_product();
		
		
	}
	
	

	
}

package testCase;

import java.awt.AWTException;
import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.RightClickPage;
import testBase.BaseClass;

public class TestRightClick extends BaseClass
{
	

	@Test
	
	public void Test_RightClick() throws InterruptedException, AWTException
	
	{
		RightClickPage rcp= new RightClickPage(milan);
		
		rcp.click_outdrLivin();
		
		Thread.sleep(Duration.ofSeconds(3));
		
		rcp.open_chainsaw();
	}

}



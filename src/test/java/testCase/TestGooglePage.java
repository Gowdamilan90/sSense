package testCase;

import java.time.Duration;

// ******************************************* right click and switch to new window********************************

import org.testng.annotations.Test;

import pageObject.GoogleHomePage;
import testBase.GoogleBaseClass;

public class TestGooglePage extends GoogleBaseClass
{
	
	@Test
	public void TypeText()
	{
		GoogleHomePage GHP= new GoogleHomePage(milan);
		
		GHP.enter_text();
	
	}

	@Test
	public void openHistory() throws InterruptedException
	{
		GoogleHomePage GHP= new GoogleHomePage(milan);
		
		//GHP.open_history();
		
		GHP.RightClickOn_History();       // ------------------------->  right Click on the target ELEMENT
		
	
	}
	
	
}

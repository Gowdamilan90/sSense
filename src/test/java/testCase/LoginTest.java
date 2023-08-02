package testCase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;

public class LoginTest extends BaseClass

{
	

	
	
	@Test

	public void refresh_home() throws InterruptedException 
	{
		
		
		HomePage LgnPge=new HomePage(milan);


	

			LgnPge.click_signIn();

			Thread.sleep(3000);

			LgnPge.setusername("milangowda1990@gmail.com");
			LgnPge.setpassword("Sanjumilli@689401");

			Thread.sleep(3000);
			LgnPge.login();
		

	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}

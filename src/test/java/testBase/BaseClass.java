package testBase;

import java.time.Duration;
import java.util.ResourceBundle;  //  ------ ---- ---- ---- ---- -->>>>>>> Import ResourceBundle from Java.Util

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePage;

public class BaseClass 
{


	public WebDriver milan;
	public ResourceBundle rb;//                ------ ---- ---- ---- ---- -->>>>>>> Calling ResourceBundle Class and assigning into a variable(rb)

	// https://github.com/Gowdamilan90/cettire123.git


	//@Parameters({"browser"})
	@BeforeClass

	//public void setup(String br) throws InterruptedException 
	
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		milan = new ChromeDriver();
		milan.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

//		if (br.equals("chrome")) 
//		{
//		WebDriverManager.chromedriver().setup();
//		milan = new ChromeDriver();
//		}
//		else
//			if(br.equals("edge"))
//			{
//				WebDriverManager.edgedriver().setup();
//				milan = new EdgeDriver();
//			}
		
		rb= ResourceBundle.getBundle("config");   //            ------ ------ ---- ---- ---- ---- -->>>>>>> Using for loading properties


		

		//milan.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		milan.get(rb.getString("appURL")); //    ------ ---- ---- ---- ---- -->>>>>>>   reading data from config.properties file
		milan.manage().window().maximize();
		
		/*

			LgnPge.click_signIn();

			Thread.sleep(3000);

			LgnPge.setusername("milangowda1990@gmail.com");
			LgnPge.setpassword("Sanjumilli@689401");

			Thread.sleep(3000);
			LgnPge.login();
		 */

	}



	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(Duration.ofSeconds(15));;
					milan.close();
					milan.quit();


	}



}

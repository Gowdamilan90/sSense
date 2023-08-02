package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBaseClass 
{

	
	public  WebDriver milan;
	ResourceBundle rb;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		milan = new ChromeDriver();
		
		milan.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		rb= ResourceBundle.getBundle("config");
		milan.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		milan.get(rb.getString("appURL2"));
		// milan.get("https://www.google.com");
		 milan.manage().window().maximize();	
		
	}
	
	
	
	@AfterClass
	public  void teardown() throws InterruptedException
	{
		
	Thread.sleep(Duration.ofSeconds(5));
		milan.quit();
	}
	
	
	
}

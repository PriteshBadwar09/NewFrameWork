package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.LoginPage;
import pompage.RegisterUser;
import utilitymethod.ReadPropData;

public class BaseTest {
public	static WebDriver driver;
public	static LoginPage loginpage;
public	static RegisterUser register;
	

  static ReadPropData rp ;
  @BeforeSuite
	public void initBrowser() //throws IOException
	{
//		ChromeOptions options = new ChromeOptions();
//		
//		options.addArguments("start-maximized");
//		options.addArguments("--incognito");
//		
//		options.addArguments("window-size=1400,3468");
//		
//		options.addArguments("--Headless");
//		
//		
//		ReadPropData rp = new ReadPropData();
//		String browserName = rp.getPropData("browser");
//		
//		if(browserName.equals("chrome"))
//		{
//		
//		 driver = new ChromeDriver(options);
//		}
//		else if(browserName.equals("Firefox"))
//		{
//			driver = new FirefoxDriver();
//		}	
		driver = new ChromeDriver();
		   driver.manage().window().maximize();
			 driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 loginpage = new LoginPage(driver);
		 
		 register = new RegisterUser(driver);
				 
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
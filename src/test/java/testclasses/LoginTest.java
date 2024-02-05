
	package testclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;
import pompage.LoginPage;
import utilitymethod.ReadPropData;
import utilitymethod.TimeValueGenerator;

public class LoginTest extends TestNGListeners {
	@Test(priority = 4)
	public void loginToApp() throws IOException
	{	
		test.info("entering the credentials");
		
		ReadPropData data = new ReadPropData();
		
		String emailValue= data.getPropData("email");
		loginpage.enterCredentials(TimeValueGenerator.getTime()+emailValue);
		
		test.info("Clicking on login button");
		
		loginpage.clickOnLogin();
	}
	
	@Test(priority = 3)
	
	public void validateTitle()
	{
		test.info("Fetching the title of page");
		
		String title= loginpage.getTitleOfPage();
		
		test.info("Validating the title");
		Assert.assertEquals(title, "Let'ss Shop");


	}


}
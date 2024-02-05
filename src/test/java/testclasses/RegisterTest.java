package testclasses;

import java.io.IOException;

import org.testng.annotations.Test;

import extentlisteners.TestNGListeners;
import utilitymethod.ReadPropData;
import utilitymethod.TimeValueGenerator;

public class RegisterTest extends TestNGListeners {
	
	@Test(priority = 1)
	public void registerUser() throws IOException
	{
		test.info("Clicking on register");
		register.clickOnRegister();
		test.info("entering the details of user");
		ReadPropData rp = new ReadPropData();
		
		String data = rp.getPropData("email");
		
		register.enteringDetails(TimeValueGenerator.getTime()+data);
	}
//Checkin git is workin or not.
	
	@Test(priority = 2)
	public void navToLoginPage()
	{
		test.info("Clicking on login button");
		register.clickOnLoginButton();
	}
}
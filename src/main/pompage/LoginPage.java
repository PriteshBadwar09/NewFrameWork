package pompage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		WebDriver driver;
		
		
		@FindBy(xpath = "//*[@id='userEmail']")
		WebElement userEmail;
		@FindBy(xpath = "//*[@id='userPassword']")
		WebElement userPassword;
		@FindBy(xpath = "//*[@id='login']")
		WebElement loginButton;
		
		
		public LoginPage(WebDriver driver)
		{
			this.driver =driver;
			PageFactory.initElements(driver, this);
		}
		
		public void enterDetails()
		{
			userEmail.sendKeys("Nashik1777@gmail.com");
			userPassword.sendKeys("Velocity123@");
		
			
		}
		public void clickloginButton()
		{
			
			loginButton.click();
		}
		
		
		public String validatepage()
		{
			String titleofpage = driver.getTitle();
			return titleofpage;
		}
		
		
		
		
	}

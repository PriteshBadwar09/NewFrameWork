package pompage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testclasses.BaseTest;

public class RegisterPage {
	
	WebDriver driver;
	
	

	@FindBy(xpath = "//*[text()='Register']")
	WebElement registerbutton;
	
	@FindBy(xpath = "//*[@id='firstName']")
	WebElement firstName;
	@FindBy(xpath = "//*[@id='lastName']")
	WebElement lastName;
	@FindBy(xpath = "//*[@id='userEmail']")
	WebElement userEmail;
	@FindBy(xpath = "//*[@id='userMobile']")
	WebElement userMobile;
	@FindBy(xpath = "//select")
	WebElement occuption;
	@FindBy(xpath = "//*[@value='Male']")
	WebElement radioButton;
	@FindBy (xpath = "//*[@id='userPassword']")
	WebElement userPassword;
	@FindBy(xpath = "//*[@id='confirmPassword']")
	WebElement confirmPassword;
	@FindBy(xpath = "//*[@formcontrolname='required']")
	WebElement chekbox;
	@FindBy(xpath = "//*[@type='submit']")
	WebElement finalregisterpage;
	@FindBy(xpath = "//*[text()='Login']")
	WebElement loginButton;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void clickRegisterPage()
	{
		registerbutton.click();
	}
	
	
	
	public void enterCrendentialinfo()
	{	
		
		registerbutton.click();
		firstName.sendKeys("Pritesh");
		lastName.sendKeys("Badwar");
		userEmail.sendKeys("Nashik1777@gmail.com");
		userMobile.sendKeys("9552345633");
		Select sel = new Select (occuption);
		sel.selectByVisibleText("Engineer");
		radioButton.click();
		userPassword.sendKeys("Velocity123@");
		confirmPassword.sendKeys("Velocity123@");
		chekbox.click();
		finalregisterpage.click();
	}
		public void clickonLoginPage()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			loginButton.click();
			
		}
		
			
		
		
		
		
		
	}
	
	

		
	



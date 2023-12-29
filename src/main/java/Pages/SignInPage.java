package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SignInPage {
	static AndroidDriver driver;

	public SignInPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="myapp:id/signin_mail")
	public static WebElement SignInEmail;
	
	@FindBy(xpath="myapp:id/signin_button")
	public static WebElement SignInBtn;
	
	@FindBy(xpath="myapp:id/mail_text")
	public static WebElement entermail;
	
	@FindBy(xpath="myapp:id/mailerror_lbl")
	public static WebElement mailerrormsg;
	
	@FindBy(xpath="myapp:id/pwd_text")
	public static WebElement enterpwd;
	
	@FindBy(xpath="myapp:id/pwderror_lbl")
	public static WebElement pwderrormsg;
	
	@FindBy(xpath="myapp:id/accountmenu_button")
	public static WebElement accountTab;
	
	@FindBy(xpath="myapp:id/signout_button")
	public static WebElement SignOutBtn;
		
	@FindBy(xpath="myapp:id/signout_link")
	public static WebElement SignoutLink;
	
	public static void ClickSignInEmail()
	{
		SignInEmail.click();
	}
	
	public static void ClickSignInBtn()
	{
		SignInBtn.click();
	}
	
	public static void entermail()
	{
		entermail.sendKeys("manali.hore@gmail.com");
	}
	public static boolean enterInvalidmail()
	{
		entermail.sendKeys("test123.@gmail");
		return false;
		
	}	
	
	public static boolean enterBlankMail()
	{
		entermail.sendKeys(" ");
		return false;
		
	}	
	
	public static void mailErrorMsg()
	{
		mailerrormsg.isDisplayed();
		
	}
	
	public static void enterpwd()
	{
		enterpwd.sendKeys("Manali@123");
	}
	
	public static boolean enterInvalidPwd()
	{
		entermail.sendKeys("Test");
		return false;
		
	}
	
	public static boolean enterBlankpwd()
	{
		enterpwd.sendKeys(" ");
		return false;
		
	}
	
	public static void pwdErrorMsg()
	{
		pwderrormsg.isDisplayed();
	}
	
	public static void ClickaccountTab()
	{
		accountTab.click();
	}
	public static void ClickSignOutBtn()
	{
		SignOutBtn.click();
	}
	public static void SignOutPopUp()
	{
		SignoutLink.click();
		
	}
	
	
}

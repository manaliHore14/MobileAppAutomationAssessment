package TestCase;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Pages.LandingPage;
import Pages.SignInPage;

public class SignInPageClass extends BaseClass {

	
	LandingPage lp = new LandingPage(driver);
	SignInPage sp = new SignInPage(null);
	@Test(priority = 0)
	public void testValidCredentials() throws Exception
	{
		driver=capabilities();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)	;
				
		lp.ClickSigninBtn();
		sp.ClickSignInEmail();
		sp.entermail();
		sp.enterpwd();
		sp.ClickSignInBtn();
		sp.ClickaccountTab();
		//Scroll down to the page height
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		sp.ClickSignOutBtn();
		sp.SignOutPopUp();
		
		}
	
	@Test(priority = 1)
	public void testInvalidCredentials() throws Exception
	{
		driver=capabilities();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)	;
				
		lp.ClickSigninBtn();
		sp.ClickSignInEmail();
		if(sp.enterInvalidmail())
		{
			sp.mailerrormsg.isDisplayed();
		}
		if(sp.enterInvalidPwd())
		{
			sp.pwderrormsg.isDisplayed();
		}
		sp.ClickSignInBtn();
		
	}
	
	@Test(priority = 2)
	public void testBlankData() throws IOException
	{
		driver=capabilities();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)	;
				
		lp.ClickSigninBtn();
		sp.ClickSignInEmail();
		boolean actualVal = sp.SignInBtn.isEnabled();
		if(sp.enterBlankMail() && sp.enterBlankpwd() && !actualVal)
		{
			
			System.out.println("Button is disabled");
		}
	}
		
	
}

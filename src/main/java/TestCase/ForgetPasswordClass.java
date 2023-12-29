package TestCase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.ForgetPasswordPage;
import Pages.LandingPage;
import Pages.SignInPage;

public class ForgetPasswordClass extends BaseClass{

	
	LandingPage lp = new LandingPage(driver);
	SignInPage sp = new SignInPage(driver);
	ForgetPasswordPage fp = new ForgetPasswordPage(driver);
	@Test
	public void testForgetPwd() throws Exception
	{
		driver=capabilities();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)	;
				
		lp.ClickSigninBtn();
		sp.ClickSignInEmail();
		sp.entermail();
		fp.ForgetPwdLink();
		
		if(fp.RestePwdPage.isDisplayed())
		{
			fp.EnterEmail();
		}
		else
		{
			System.out.println("No text to enter mail");
		}
		if(	fp.ClickResetPwd())
		{
		Thread.sleep(1500);
		fp.ResetPwdSuccessMsg.isDisplayed();
		}
		else
		{
			System.out.println("Reset password unsuccessfull");
		}
		
		
}
	
}

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ForgetPasswordPage {
	
	
		static AndroidDriver driver;

		public ForgetPasswordPage(AndroidDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);	
		}

		@FindBy(xpath="myapp:id/forgetpassword_button")
		public static WebElement forgetpwdlink;
		
		@FindBy(xpath="myapp:id/reset_pwdpage")
		public static WebElement RestePwdPage;
		
		@FindBy(xpath="myapp:id/mail_text")
		public static WebElement EnterEmail;
		
		@FindBy(xpath="myapp:id/restepwd_link")
		public static WebElement ClickResetPwd;
		
		@FindBy(xpath="myapp:id/success_page")
		public static WebElement ResetPwdSuccessMsg;
		
		
		
		
		public static void ForgetPwdLink()
		{
			forgetpwdlink.click();
		}
		
		public static void EnterEmail()
		{
			EnterEmail.sendKeys("manali.hore@gmail.com");
		}
		
		public static boolean ClickResetPwd()
		{
			ClickResetPwd.click();
			return false;
		}
		
		
		
}



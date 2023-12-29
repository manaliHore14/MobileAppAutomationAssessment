package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LandingPage {

	AndroidDriver driver;
	
	public LandingPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")
	public static WebElement SignInBtn;
	
	
	
	public static void ClickSigninBtn()
	{
		SignInBtn.click();
	}



	
}

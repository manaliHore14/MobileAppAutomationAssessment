package TestCase;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Pages.LandingPage;

public class LandingPageClass extends BaseClass{

	@Test
	public void landingPageScreen() throws Exception
	{
		driver=capabilities();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)	;
		System.out.println("App Open....");
		
		LandingPage lp = new LandingPage(driver);
		lp.ClickSigninBtn();
		}
}

package TestCase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appium.BaseAndroidTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AndroidDriver<AndroidElement> driver;
//	public static Logger log = LogManager.getLogger(BaseAndroidTest.class.getName());
	private static int portNum=4723; 
	
	
	public static AndroidDriver capabilities() throws MalformedURLException
	{
	
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability("platformName", "Android");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		//caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(CapabilityType.VERSION,"");
		caps.setCapability("deviceName", "Redmi Note 8 Pro");
		caps.setCapability("udid", "knei7x4hf6cmvknv");
		caps.setCapability("appPackage", "com.udemy.android");
		caps.setCapability("appActivity", "com.udemy.android.CombinedDeepLinkActivity");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20);
				
		driver=new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		return driver;	
		
	}
	
}


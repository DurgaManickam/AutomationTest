import static org.junit.Assert.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.text.html.ListView;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appnew {

	AndroidDriver driver;
	List<WebElement> drawerMenuIcon;
	@Test
	public void test() throws Exception {
		  
		
		/*if(driver.isAppInstalled("com.driveu.partner") == false){
		driver.installApp("/Users/durgadevi/Documents/workspace/AppiumExample/src/app-release.apk");
		}*/
		
		try{//installing newly
			DesiredCapabilities cap = new DesiredCapabilities();
		    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "500");
		    cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.driveu.partner");
		    cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.driveu.partner.MainActivity");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			Thread.sleep(5000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try{//app already in the device
			File appDir = new File("src");
	        File app = new File(appDir, "partner-app-release-jun18.apk");
		    DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "500"); 
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		    Thread.sleep(2000);
		}
		catch(Exception e){
			e.printStackTrace();
		}	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'SIGN IN')]")).click();
		Thread.sleep(3000);
		List<WebElement> edit_Text = driver.findElements(By.className("android.widget.EditText"));
		edit_Text.get(0).sendKeys("9787544561");
		edit_Text.get(1).sendKeys("1234");
		driver.sendKeyEvent(AndroidKeyCode.ENTER);
		Thread.sleep(5000);
		drawerMenuIcon = driver.findElements(By.className("android.widget.ImageView"));
		drawerMenuIcon.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Current Booking')]")).click();
		drawerMenuIcon.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'History')]")).click();
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"History\")").click();
		Thread.sleep(10000);
		
		ifElseuiauto();
		 
		//driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'My Wallet')]")).click();
		 
		driver.closeApp();
		 
		//driver.sendKeyEvent(AndroidKeyCode.BACK);
		
	}
	void ifElseuiauto() throws Exception{
		try{	
			if( driver.findElement(By.xpath("//android.widget.LinearLayout[1]/"
		 			 		+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
		 			 		+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/"
		 			 		+ "android.view.View[1]/android.view.View[1]/"
		 			 		+ "android.support.v4.widget.DrawerLayout[1]/"
		 			 		+ "android.view.View[1]/android.widget.ScrollView[1]/"
		 			 		+ "android.view.View[1]/android.widget.ScrollView[1]/"
		 			 		+ "android.view.View[1]/android.view.View[1]")).isDisplayed()){
			
				 driver.findElement(By.xpath("//android.widget.LinearLayout[1]/"
		 			 		+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
		 			 		+ "android.view.View[1]/android.view.View[1]/android.view.View[1]/"
		 			 		+ "android.view.View[1]/android.view.View[1]/"
		 			 		+ "android.support.v4.widget.DrawerLayout[1]/"
		 			 		+ "android.view.View[1]/android.widget.ScrollView[1]/"
		 			 		+ "android.view.View[1]/android.widget.ScrollView[1]/"
		 			 		+ "android.view.View[1]/android.view.View[1]")).click();
				 Thread.sleep(1000);
				 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"TRANSACTIONS\")").click();
				 Thread.sleep(3000);
				 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"CLOSE\")").click();
				 Thread.sleep(2000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try{
			driver.findElementByClassName("android.widget.ImageView").click();
			 Thread.sleep(2000);drawerMenuIcon.get(0).click();
			 Thread.sleep(4000);
			 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"My Wallet\")").click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'TRANSACTIONS')]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'BALANCE')]")).click();
			 Thread.sleep(2000);
			 drawerMenuIcon.get(0).click();
			 Thread.sleep(1000);
			 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Help\")").click();
			 Thread.sleep(5000);
			 driver.sendKeyEvent(AndroidKeyCode.BACK);
			 Thread.sleep(2000);
			 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Check In\")").click();
			 Thread.sleep(5000);
			 drawerMenuIcon.get(0).click();
			 Thread.sleep(2000);
			 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign Out\")").click();
			 Thread.sleep(5000);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

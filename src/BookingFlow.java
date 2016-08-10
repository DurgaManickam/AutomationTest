import static org.junit.Assert.*;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BookingFlow {

	Dimension screenSize ;
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		 
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		 cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "500");
		 cap.setCapability(MobileCapabilityType.APP_PACKAGE, "com.driveu.partner");
		 cap.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.driveu.partner.MainActivity");
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'SIGN IN')]")).click();
		 Thread.sleep(10000);
		 List<WebElement> edit_Text = driver.findElements(By.className("android.widget.EditText"));
		 edit_Text.get(0).sendKeys("9787544561");
		 edit_Text.get(1).sendKeys("1234");
		 driver.sendKeyEvent(AndroidKeyCode.ENTER);
		 Thread.sleep(10000);
		 
		 screenSize= driver.manage().window().getSize();
		 int startx = (int) (screenSize.width * 0.10);
		 int endx = (int) (screenSize.width * 0.90);
		 int starty = (int)(screenSize.height * 0.95);
		 int endy = (int) (screenSize.height * 0.95);
		 driver.swipe(startx,starty , endx, endy, 6000);
		 Thread.sleep(10000);
		 
		 
		 
	}

}

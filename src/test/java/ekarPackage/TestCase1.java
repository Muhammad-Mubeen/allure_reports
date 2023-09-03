package ekarPackage;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class TestCase1 {
	static AndroidDriver<AndroidElement> driver;
  @Test
  public void testMthod1() throws MalformedURLException, InterruptedException {
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "POCO X3 NFC");
      caps.setCapability("udid", "76e3b1d3");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "in.testdemo.map");
      caps.setCapability("appActivity", "in.testdemo.map.MainActivity");
      caps.setCapability("autoGrantPermissions", true);
      caps.setCapability("locationServicesAuthorized", true);
      caps.setCapability("locationServicesEnabled", true);
      caps.setCapability("locationProvider", "gps");
      caps.setCapability("gpsEnabled", true);
      caps.setCapability("locationCoordinate", "LAT,LONG"); 

   
      driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
      EkarAppTest appTest = new EkarAppTest(driver); 
      appTest.testApp();
      driver.quit();
  }
}

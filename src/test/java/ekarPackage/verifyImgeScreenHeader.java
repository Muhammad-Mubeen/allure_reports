package ekarPackage;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class verifyImgeScreenHeader {
	static AndroidDriver<AndroidElement> driver;
  @Test
  public void verifyText() {
	  AppFunctions appTest = new AppFunctions(driver);
	  appTest.verifyImageScreenHeader();
  }
}

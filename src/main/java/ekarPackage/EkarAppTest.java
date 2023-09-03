package ekarPackage;

import java.net.MalformedURLException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class EkarAppTest {
    private WebDriver driver;

    public EkarAppTest(WebDriver driver) {
        this.driver = driver;
    }

	@Test
    public void testApp() throws InterruptedException, MalformedURLException {
        // Initialize driver and start the app
//		if (driver == null) {
//            throw new RuntimeException("Driver instance is null. Please set the driver before running the test.");
//        }
		AppFunctions appFunctions = new AppFunctions((AndroidDriver<AndroidElement>) driver);
//		AppFunctions.startApp();
		
        appFunctions.clickLocationPin();
        
//        appFunctions.verifyImageScreenHeader();
//        
//        appFunctions.enterComments();
//        
//        appFunctions.clickNextButton1();
//        
//        appFunctions.uploadFirstImage();
//        
//        appFunctions.clickNextButton1();
//        
//        appFunctions.uploadBackImage();
//        
//        appFunctions.clickNextButton1();
//        
//        appFunctions.uploadLeftImage();
//        
//        appFunctions.clickNextButton1();
//        
//        appFunctions.uploadRightImage();
//        
//        appFunctions.clickNextButton();
       
        // Assert.assertEquals(actualText, expectedText, "Element text doesn't match the expected text.");
        

        // Assert.assertEquals(toastMessage, expectedToastText, "Toast text doesn't match the expected text.");
    }

}

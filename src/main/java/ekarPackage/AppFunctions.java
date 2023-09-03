package ekarPackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class AppFunctions {
    private AndroidDriver<AndroidElement> driver;
    private WebDriverWait wait; 

    public AppFunctions(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10); 
    }
    @Test
    public void clickLocationPin() {
        
        AndroidElement locationPin = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.LOCATION_PIN));
        locationPin.click();
    }
    @Test
    public void verifyImageScreenHeader() {
    	AndroidElement imageHeaderText = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.Image_Screen_Header_Text));
    	imageHeaderText.getText();
    	String actualText = imageHeaderText.getText().replaceAll("\\s", "");
        String expectedText = "Please identify the unreporte damage area";
//        System.out.println("Textyyyyyyy!" + actualText);
        
        expectedText = expectedText.replaceAll("\\s", "");

        if (actualText.contains(expectedText)) {
            System.out.println("Text verification passed!");
        } else {
            System.out.println("Text verification failed!");
        }
    }
    @Test
    public void uploadFirstImage() {    
        AndroidElement frontImage = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.FRONT_IMAGE));
        frontImage.click();
        
        AndroidElement galleryOption = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.Select_Gallary_Option));
        galleryOption.click();
        
        By lastLineLocator = By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, August 25, 2023 14:16:13\"]/android.widget.FrameLayout/android.widget.TextView");
        
        try {
            AndroidElement lastLineElement = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(lastLineLocator));
            lastLineElement.click();
        } catch (Exception e) {
            // Handle any exceptions here
            e.printStackTrace();
        }     
    }
    @Test
    public void uploadBackImage() {    
        AndroidElement backImage = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.BACK_IMAGE));
        backImage.click();
        
        AndroidElement galleryOption = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.Select_Gallary_Option));
        galleryOption.click();
        
        By lastLineLocator = By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, August 25, 2023 14:16:13\"]/android.widget.FrameLayout/android.widget.TextView");     
//        By lastLineLocator = By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, August 25, 2023 14:16:13\"]/android.widget.FrameLayout/android.widget.TextView");
        
        try {
            AndroidElement lastLineElement = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(lastLineLocator));
            lastLineElement.click();
        } catch (Exception e) {
            // Handle any exceptions here
            e.printStackTrace();
        }  
    
    }
    @Test
    public void uploadLeftImage() {    
        AndroidElement leftImage = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.LEFT_IMAGE));
        leftImage.click();
        
        AndroidElement galleryOption = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.Select_Gallary_Option));
        galleryOption.click();
        
        By lastLineLocator = By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, August 25, 2023 14:16:13\"]/android.widget.FrameLayout/android.widget.TextView");     
//        By lastLineLocator = By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, August 25, 2023 14:16:13\"]/android.widget.FrameLayout/android.widget.TextView");     
      
      try {
          AndroidElement lastLineElement = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(lastLineLocator));
          lastLineElement.click();
      } catch (Exception e) {
          // Handle any exceptions here
          e.printStackTrace();
      }  
    }
    @Test
    public void uploadRightImage() {    
        AndroidElement rightImage = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.RIGHT_IMAGE));
        rightImage.click();
        
        AndroidElement galleryOption = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(Locators.Select_Gallary_Option));
        galleryOption.click();
        
        By lastLineLocator = By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo, August 25, 2023 14:16:13\"]/android.widget.FrameLayout/android.widget.TextView");     
        
	    try {
	        AndroidElement lastLineElement = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(lastLineLocator));
	        lastLineElement.click();
	    } catch (Exception e) {
	        // Handle any exceptions here
	        e.printStackTrace();
	    } 
    }
    @Test
    public void enterComments() {
    	driver.findElementById("in.testdemo.map:id/cmd_txt").sendKeys("This is test comment");
    }
    @Test
    public static void scrollDown(AndroidDriver<AndroidElement> driver) {
        int screenHeight = driver.manage().window().getSize().getHeight();
        int screenWidth = driver.manage().window().getSize().getWidth();

        int startX = screenWidth / 2;
//        int startY = (int) (screenHeight * 0.8);
        int endY = (int) (screenHeight * 0.2);

        driver.performTouchAction(
            new io.appium.java_client.TouchAction<>(driver)
                .longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(driver.findElementById("in.testdemo.map:id/cmd_txt")))
                        .withDuration(Duration.ofMillis(100))) 
                .moveTo(ElementOption.point(startX, endY))
                .release()
        );
    }
    @Test
    public void clickNextButton1() {
    	scrollDown(driver);
    	driver.findElementById("in.testdemo.map:id/next_btn").click();
    }
    @Test
    public void clickNextButton() {
    
    	driver.findElementById("in.testdemo.map:id/next_btn").click();
    }
    
//    public void toastText() {
////    	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//   
//    	File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//        File screenshotFile = new File("screenshot.png");
//        try {
//            Path destination = screenshotFile.toPath();
//            Files.copy(screenshot1.toPath(), destination, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        ITesseract tesseract = new Tesseract();
//        tesseract.setDatapath("path_to_tessdata_folder");
//        String toastText = tesseract.doOCR(screenshotFile);
//
//        System.out.println("Toast Text: " + toastText);
//    }
    

}

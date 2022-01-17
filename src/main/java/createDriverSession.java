import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class createDriverSession {

    public static void main(String[] args) throws MalformedURLException {



        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability("newCommandTimeout", 300);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");

//              caps.setCapability("avd", "Pixel_3");
//              caps.setCapability("avdLaunchTimeout",180000);
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                + "resources" + File.separator + "ims-dailyavailability-android-prod-3.0.25.apk";
        //"ApiDemos-debug.apk";
//              caps.setCapability("appPackage", "io.appium.android.apis");
//              caps.setCapability("appActivity", "io.appium.android.apis.accessibility.CustomViewAccessibilityActivity");
        caps.setCapability(MobileCapabilityType.APP, appUrl);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AndroidDriver(url, caps);


        System.out.println("session id: " + driver.getSessionId());
    }










//            case "iOS":
//
//                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
//                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//                caps.setCapability(MobileCapabilityType.UDID, "77F6B8F0-8877-4EDF-8C8C-99DBE64A93FF");
//                String iOSappUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
//                        + "resources" + File.separator + "ApiDemos-debug.apk";
//                return new iOSDriver(url, caps);





}

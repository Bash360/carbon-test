package ng.com.carbon;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CarbonAutomation {

    public static void main( String[] args){
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"bash");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/bash/desktop/paylater-full-debug-v5.5.3-1909091739.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
        desiredCapabilities.setCapability("appPackage","com.lenddo.mobile.paylater.staging");
        desiredCapabilities.setCapability("appActivity","");
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            AndroidDriver<WebElement> androidDriver = new AndroidDriver<WebElement>(url, desiredCapabilities);

            androidDriver .quit();
        }catch(MalformedURLException malURL){
            System.out.println(malURL.getMessage());
        }

    }
}

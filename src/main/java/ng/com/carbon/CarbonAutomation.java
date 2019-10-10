package ng.com.carbon;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CarbonAutomation {
    String deviceName;
    String platformName;
    String platformVersion;
    String app; //location of application on your work station
    AndroidDriver<WebElement> androidDriver;

    public CarbonAutomation(String deviceName, String platformName, String platformVersion, String app) {
        this.deviceName = deviceName;
        this.platformName = platformName;
        this.platformVersion = platformVersion;
        this.app = app;
        connectDevice(deviceName,platformName,platformVersion,app);
    }
    public void connectDevice(String deviceName, String platformName, String platformVersion, String app) {
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        desiredCapabilities.setCapability(MobileCapabilityType.APP,app);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,platformName);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
        desiredCapabilities.setCapability("appPackage","com.lenddo.mobile.paylater.staging");
        desiredCapabilities.setCapability("appActivity","");
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
             androidDriver = new AndroidDriver<WebElement>(url, desiredCapabilities);
             Thread.sleep(3000);
            System.out.println("device connected successfully");

        }catch(MalformedURLException malURL){
            System.out.println(malURL.getMessage());
        }catch(InterruptedException threadError){
            System.out.println(threadError.getMessage());
        }

    }
 public void disconnectDevice(){
        androidDriver.quit();
 }
 public String signIn(){
 return "";
 }
 public static void main(String[] args){

 }



}

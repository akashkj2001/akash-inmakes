package org.inmakesappium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
	public static AndroidDriver driver;
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "13");
	cap.setCapability("deviceName", "CPH2359");
	cap.setCapability("udid", "UKAU6P6HTOZHEMIJ");
	cap.setCapability("appPackage", "com.android.chrome");
	cap.setCapability("appActivity", "com.android.calculator2.Calculator");
	
	URL url = new URL("http://0.0.0.0:4723/wd/hub");
    driver = new AndroidDriver(url,cap);
}
}

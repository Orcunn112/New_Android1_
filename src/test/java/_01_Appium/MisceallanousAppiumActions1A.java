package _01_Appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class MisceallanousAppiumActions1A extends BaseTest{
    @Test
    public void Miscellanous() throws MalformedURLException, InterruptedException {

        //App package & App Activity
        //adb shell dumpsys window | find "mCurrentFocus"

        Activity activity=new Activity("com.google.android.apps.nexuslauncher","io.appium.android.apis.preference.PreferenceDependencies");
        driver.startActivity(activity);

        driver.findElement(By.id("android:id/checkbox")).click();
        //telefonu cevirme
        DeviceRotation landScape=new DeviceRotation(0,0,90);
        driver.rotate(landScape);

        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle, "WiFi settings");

        //copy paste
        //copy to clipboard-paste it  clipboard
        driver.setClipboardText("orcun");
        driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));


        //set wifi name

    }


}
////